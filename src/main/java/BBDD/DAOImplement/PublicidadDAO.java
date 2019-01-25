package BBDD.DAOImplement;

import BBDD.Conection;
import BBDD.ModelosBD.PublicidadEntity;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firestore.v1beta1.Write;
import com.google.protobuf.Api;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class PublicidadDAO implements IDAO<PublicidadEntity> {

    private final String collection = "Publicidades";
    Firestore dbstore = Conection.database;

    @Override
    public boolean create(PublicidadEntity objeto) {
        boolean created = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getReferenciaInmueble()).set(objeto);
        created = true;
        return created;
    }

    @Override
    public List<PublicidadEntity> read() throws ExecutionException, InterruptedException {
        List<PublicidadEntity> existingDocuments = new ArrayList<>();
        ApiFuture<QuerySnapshot> future = dbstore.collection(collection).get();
        List<QueryDocumentSnapshot> documentlist = future.get().getDocuments();

        for(QueryDocumentSnapshot document : documentlist){
            existingDocuments.add(document.toObject(PublicidadEntity.class));
        }

        return existingDocuments;
    }

    @Override
    public boolean update(PublicidadEntity objeto) {
        boolean updated = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getReferenciaInmueble()).set(objeto);
        updated = true;
        return updated;
    }

    @Override
    public boolean delete(PublicidadEntity objeto) {
        boolean deleted = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getReferenciaInmueble()).delete();
        deleted = true;
        return deleted;
    }
}
