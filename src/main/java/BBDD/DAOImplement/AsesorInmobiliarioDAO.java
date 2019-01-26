package BBDD.DAOImplement;

import BBDD.Conection;
import BBDD.ModelosBD.AsesorInmobiliarioEntity;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class AsesorInmobiliarioDAO implements IDAO<AsesorInmobiliarioEntity> {
    final String collection= "Asesores Inmobiliarios";
    Firestore dbstore = Conection.database;

    @Override
    public boolean create(AsesorInmobiliarioEntity objeto) {
        boolean created = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getCedula()).set(objeto);
        created = true ;
        return created;
    }

    @Override
    public List<AsesorInmobiliarioEntity> read() throws ExecutionException, InterruptedException {
        List<AsesorInmobiliarioEntity> existingDocuments = new ArrayList<>();
        ApiFuture<QuerySnapshot> future = dbstore.collection(collection).get();
        List<QueryDocumentSnapshot> documentlist = future.get().getDocuments();
        if(!documentlist.isEmpty())
        for(QueryDocumentSnapshot document: documentlist){
            existingDocuments.add(document.toObject(AsesorInmobiliarioEntity.class));
        }

        return existingDocuments;
    }

    @Override
    public boolean update(AsesorInmobiliarioEntity objeto) {
        boolean updated = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getCedula()).set(objeto);
        updated = true;
        return false;
    }

    @Override
    public boolean delete(AsesorInmobiliarioEntity objeto) {
        boolean deleted = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getCedula()).delete();
        deleted = true;
        return false;
    }
}
