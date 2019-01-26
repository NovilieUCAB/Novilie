package BBDD.DAOImplement;

import BBDD.Conection;
import BBDD.ModelosBD.AgenciaInmobiliariaEntity;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class AgenciaInmobiliariaDAO implements IDAO<AgenciaInmobiliariaEntity> {

    final String collection= "Agencia";
    Firestore dbstore = Conection.database;

    @Override
    public boolean create(AgenciaInmobiliariaEntity objeto) {
        boolean created = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getNombreAgencia()).set(objeto);
        created = true ;
        return created;
    }

    @Override
    public List<AgenciaInmobiliariaEntity> read() throws ExecutionException, InterruptedException {
        List<AgenciaInmobiliariaEntity> existingDocuments = new ArrayList<>();
        ApiFuture<QuerySnapshot> future = dbstore.collection(collection).get();
        List<QueryDocumentSnapshot> documentlist = future.get().getDocuments();
        if(!documentlist.isEmpty())
            for(QueryDocumentSnapshot document: documentlist){
                existingDocuments.add(document.toObject(AgenciaInmobiliariaEntity.class));
            }

        return existingDocuments;
    }

    @Override
    public boolean update(AgenciaInmobiliariaEntity objeto) {
        boolean updated = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getNombreAgencia()).set(objeto);
        updated = true;
        return false;
    }

    @Override
    public boolean delete(AgenciaInmobiliariaEntity objeto) {
        boolean deleted = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getNombreAgencia()).delete();
        deleted = true;
        return false;
    }
}
