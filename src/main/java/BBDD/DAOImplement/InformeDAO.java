package BBDD.DAOImplement;

import BBDD.Conection;
import BBDD.ModelosBD.InformeEntity;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class InformeDAO implements IDAO<InformeEntity>{

    Firestore dbstore = Conection.database;
    private final String collection = "Informes";

    @Override
    public boolean create(InformeEntity objeto) {
        boolean created = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getCedulaAsesor()).set(objeto);
        created = true;
        return created;
    }

    @Override
    public List<InformeEntity> read() throws ExecutionException, InterruptedException {
        List<InformeEntity> existingDocuments = new ArrayList<>();
        ApiFuture<QuerySnapshot> future = dbstore.collection(collection).get();
        List<QueryDocumentSnapshot> documentlist = future.get().getDocuments();

        if(!documentlist.isEmpty())
        for(QueryDocumentSnapshot document : documentlist){
            existingDocuments.add(document.toObject(InformeEntity.class));
        }

        return existingDocuments;
    }

    @Override
    public boolean update(InformeEntity objeto) {
        boolean updated = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getCedulaAsesor()).set(objeto);
        updated = true;
        return updated;
    }

    @Override
    public boolean delete(InformeEntity objeto) {
        boolean deleted = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getCedulaAsesor()).delete();
        deleted = true;
        return deleted;
    }
}
