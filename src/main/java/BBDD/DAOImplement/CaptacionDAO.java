package BBDD.DAOImplement;

import BBDD.Conection;
import BBDD.ModelosBD.CaptacionEntity;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.protobuf.Api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class CaptacionDAO implements IDAO<CaptacionEntity> {

    private final String collection = "Captaciones";
    Firestore dbstore = Conection.database;

    @Override
    public boolean create(CaptacionEntity objeto) {
        boolean created = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getReferenciaInmueble()).set(objeto);
        created = true;
        return false;
    }

    @Override
    public List<CaptacionEntity> read() throws ExecutionException, InterruptedException {
        List<CaptacionEntity> existingDocuments = new ArrayList<>();
        ApiFuture<QuerySnapshot> future = dbstore.collection(collection).get();
        List<QueryDocumentSnapshot> documentlist = future.get().getDocuments();

        if(!documentlist.isEmpty())
        for(QueryDocumentSnapshot document : documentlist){
            existingDocuments.add(document.toObject(CaptacionEntity.class));
        }

        return existingDocuments;
    }

    @Override
    public boolean update(CaptacionEntity objeto) {
        boolean updated = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getReferenciaInmueble()).set(objeto);
        updated = true;
        return false;
    }

    @Override
    public boolean delete(CaptacionEntity objeto) {
        boolean deleted = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getReferenciaInmueble()).delete();
        deleted = true;
        return false;
    }
}
