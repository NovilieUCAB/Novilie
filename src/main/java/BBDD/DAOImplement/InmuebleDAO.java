package BBDD.DAOImplement;

import BBDD.Conection;
import BBDD.ModelosBD.InmuebleEntity;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;

import javax.swing.text.Document;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class InmuebleDAO implements IDAO<InmuebleEntity> {

    Firestore dbstore = Conection.database;


    @Override
    public boolean create(InmuebleEntity objeto) {
        boolean created = false;
        ApiFuture<WriteResult> future = dbstore.collection("Inmuebles").document(objeto.getNumReferencia()).set(objeto);
        created = true;
        return false;
    }

    @Override
    public List<InmuebleEntity> read() throws ExecutionException, InterruptedException {
        List<InmuebleEntity> existingDocuments = new ArrayList<>();
        ApiFuture<QuerySnapshot> future = dbstore.collection("Inmuebles").get();
        List<QueryDocumentSnapshot> documentlist =null;
        documentlist = future.get().getDocuments();

        if(!documentlist.isEmpty())
        for (QueryDocumentSnapshot document : documentlist){
            existingDocuments.add(document.toObject(InmuebleEntity.class));
        }

        return existingDocuments;
    }

    @Override
    public boolean update(InmuebleEntity objeto) {
        boolean updated = false;
        ApiFuture<WriteResult> future = dbstore.collection("Inmuebles").document(objeto.getNumReferencia()).set(objeto);
        updated = true;
        return updated;
    }

    @Override
    public boolean delete(InmuebleEntity objeto) {
        boolean deleted = false ;
        ApiFuture<WriteResult> future = dbstore.collection("Inmuebles").document(objeto.getNumReferencia()).delete();
        deleted = true;
        return false;
    }
}
