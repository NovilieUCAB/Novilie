package BBDD.DAOImplement;

import BBDD.Conection;
import BBDD.ModelosBD.AsesorInmobiliarioEntity;
import BBDD.ModelosBD.ClienteEntity;
import BBDD.ModelosBD.ClientePotencialEntity;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class ClientePotencialDAO implements IDAO<ClientePotencialEntity> {

    final String collection= "Clientes Potenciales";
    Firestore dbstore = Conection.database;

    @Override
    public boolean create(ClientePotencialEntity objeto) {
        boolean created = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getCedula()).set(objeto);
        created = true ;
        return created;
    }

    @Override
    public List<ClientePotencialEntity> read() throws ExecutionException, InterruptedException {

        List<ClientePotencialEntity> existingDocuments = new ArrayList<>();
        ApiFuture<QuerySnapshot> future = dbstore.collection(collection).get();
        List<QueryDocumentSnapshot> documentlist = future.get().getDocuments();
        if(!documentlist.isEmpty())
            for(QueryDocumentSnapshot document: documentlist){
                existingDocuments.add(document.toObject(ClientePotencialEntity.class));
            }

        return existingDocuments;
    }

    @Override
    public boolean update(ClientePotencialEntity objeto) {
        boolean updated = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getCedula()).set(objeto);
        updated = true;
        return false;
    }

    @Override
    public boolean delete(ClientePotencialEntity objeto) {
        boolean deleted = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getCedula()).delete();
        deleted = true;
        return false;
    }


}
