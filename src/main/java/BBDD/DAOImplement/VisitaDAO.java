package BBDD.DAOImplement;

import BBDD.Conection;
import BBDD.ModelosBD.VisitaEntity;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class VisitaDAO implements IDAO<VisitaEntity> {

    Firestore dbstore = Conection.database;
    private final String collection = "Visitas";

    @Override
    public boolean create(VisitaEntity objeto) {
        boolean created = false;
        String title = objeto.getReferenciaInmueble()+objeto.getCedulaClientePotencial()+objeto.getCedulaPropietario()+objeto.getCedulaAsesor();
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(title).set(objeto);
        created = true;
        return created;
    }

    @Override
    public List<VisitaEntity> read() throws ExecutionException, InterruptedException {
        List<VisitaEntity> existingDocuments = new ArrayList<>();
        ApiFuture<QuerySnapshot> future = dbstore.collection(collection).get();
        List<QueryDocumentSnapshot> documentlist = future.get().getDocuments();

        for(QueryDocumentSnapshot document : documentlist){
            existingDocuments.add(document.toObject(VisitaEntity.class));
        }

        return existingDocuments;
    }

    @Override
    public boolean update(VisitaEntity objeto) {
        boolean updated = false;
        String title = objeto.getCedulaClientePotencial()+objeto.getCedulaPropietario()+objeto.getCedulaAsesor();
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getReferenciaInmueble()+title).set(objeto);
        updated = true;
        return updated;
    }

    @Override
    public boolean delete(VisitaEntity objeto) {
        boolean deleted = false;
        String title = objeto.getReferenciaInmueble()+objeto.getCedulaClientePotencial()+objeto.getCedulaPropietario()+objeto.getCedulaAsesor();
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(title).delete();
        deleted = true;
        return deleted;
    }
}
