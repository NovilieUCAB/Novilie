package BBDD.DAOImplement;

import BBDD.Conection;
import BBDD.ModelosBD.ConyugeEntity;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.protobuf.Api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

public class ConyugeDAO implements IDAO<ConyugeEntity>{

    /*Crear nuevo documento Conyuge
    * Cedula = titulo documento
    * Collection = Conyuge
    * */

    Firestore dbstore = Conection.database;

    @Override
    public boolean create(ConyugeEntity objeto) {
        boolean create = false;
        ApiFuture<WriteResult> future = dbstore.collection("Conyuges").document(objeto.getCedula()).set(objeto);
        create = true;

        return create;
    }

    @Override
    public List<ConyugeEntity> read() {
        List<ConyugeEntity> existingDocuments = new ArrayList<>();
        ApiFuture<QuerySnapshot> future = dbstore.collection("Conyuges").get();
        List<QueryDocumentSnapshot> documentlist = null;
        try {
            documentlist = future.get().getDocuments();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        if(!documentlist.isEmpty())
        for (QueryDocumentSnapshot document: documentlist){
            existingDocuments.add(document.toObject(ConyugeEntity.class));
        }

        return existingDocuments;
    }


    @Override
    public boolean update(ConyugeEntity objeto) {
        boolean updated = false;
        ApiFuture<WriteResult> future = dbstore.collection("Conyuges").document(objeto.getCedula()).set(objeto);
        updated = true;
        return updated;
    }

    @Override
    public boolean delete(ConyugeEntity objeto) {
        boolean delete = false;
        ApiFuture<WriteResult> future = dbstore.collection("Conyuges").document(objeto.getCedula()).delete();
        delete = true;

        return delete;
    }

    public ConyugeEntity retrieve(String cedula){
        ConyugeEntity retConyuge =null;
        DocumentReference docRef = dbstore.collection("Conyuges").document(cedula);
        ApiFuture<DocumentSnapshot> future = docRef.get();
        try {
            DocumentSnapshot doc = future.get();
            if(doc.exists()){
                System.out.println("Found doc");
                retConyuge = doc.toObject(ConyugeEntity.class);
            }else{
                System.out.println("Doesn't exist");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        return retConyuge;
    }
}
