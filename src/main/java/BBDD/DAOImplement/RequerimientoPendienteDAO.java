package BBDD.DAOImplement;

import BBDD.Conection;
import BBDD.ModelosBD.RequerimientoPendienteEntity;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firestore.v1beta1.WriteRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class RequerimientoPendienteDAO implements IDAO<RequerimientoPendienteEntity> {

    Firestore dbstore = Conection.database;
    private final String collection = "Requerimientos Pendientes";

    @Override
    public boolean create(RequerimientoPendienteEntity objeto) {
        boolean created = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getNumReferencia()).set(objeto);
        created = true;
        return created;
    }

    @Override
    public List<RequerimientoPendienteEntity> read() throws ExecutionException, InterruptedException {
        List<RequerimientoPendienteEntity> existingDocuments = new ArrayList<>();
        ApiFuture<QuerySnapshot> future = dbstore.collection(collection).get();
        List<QueryDocumentSnapshot> documentlist = future.get().getDocuments();

        for(QueryDocumentSnapshot document : documentlist){
            existingDocuments.add(document.toObject(RequerimientoPendienteEntity.class));
        }

        return existingDocuments;
    }

    @Override
    public boolean update(RequerimientoPendienteEntity objeto) {
        boolean updated = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getNumReferencia()).set(objeto);
        updated = true;
        return updated;
    }

    @Override
    public boolean delete(RequerimientoPendienteEntity objeto) {
        boolean deleted = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getNumReferencia()).delete();
        deleted = true;
        return deleted;
    }
}
