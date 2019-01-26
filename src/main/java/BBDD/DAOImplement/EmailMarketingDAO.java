package BBDD.DAOImplement;

import BBDD.Conection;
import BBDD.ModelosBD.EmailMarketingEntity;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.protobuf.Api;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class EmailMarketingDAO implements IDAO<EmailMarketingEntity> {

    Firestore dbstore = Conection.database;
    private final String collection = "EmailMarketing";

    @Override
    public boolean create(EmailMarketingEntity objeto) {
        boolean created = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getReferenciaInmueble()).set(objeto);
        created = true;
        return created;
    }

    @Override
    public List<EmailMarketingEntity> read() throws ExecutionException, InterruptedException {
        List<EmailMarketingEntity> existingDocuments = new ArrayList<>();
        ApiFuture<QuerySnapshot> future = dbstore.collection(collection).get();
        List<QueryDocumentSnapshot> documentlist = future.get().getDocuments();

        for(QueryDocumentSnapshot document : documentlist){
            existingDocuments.add(document.toObject(EmailMarketingEntity.class));
        }

        return existingDocuments;
    }

    @Override
    public boolean update(EmailMarketingEntity objeto) {
        boolean updated = false;
        ApiFuture<WriteResult> future  = dbstore.collection(collection).document(objeto.getReferenciaInmueble()).set(objeto);
        updated = true;
        return updated;
    }

    @Override
    public boolean delete(EmailMarketingEntity objeto) {
        boolean deleted =  false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getReferenciaInmueble()).delete();
        deleted = true;
        return deleted;
    }
}
