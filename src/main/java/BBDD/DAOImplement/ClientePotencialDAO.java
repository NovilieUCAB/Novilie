package BBDD.DAOImplement;

import BBDD.Conection;
import BBDD.ModelosBD.ClienteEntity;
import BBDD.ModelosBD.ClientePotencialEntity;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class ClientePotencialDAO implements IDAO<ClientePotencialEntity> {

    private static Conection db;

    private static Conection getDb() {
        return db;
    }

    private static void setDb(Conection db) {
        ClientePotencialDAO.db = db;
    }

    static {
        try {
            setDb(new Conection());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public boolean create(ClientePotencialEntity objeto) {
        boolean create = false;

        try{

            ApiFuture<WriteResult> future = getDb().getDatabase().collection("ClientesPotenciales").document(objeto.getCedula()).set(objeto);
            System.out.println(future.get().getUpdateTime());
            create = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return create;
    }

    @Override
    public List<ClientePotencialEntity> read() throws ExecutionException, InterruptedException {

        List<ClientePotencialEntity> clientes = new ArrayList<>();

        ApiFuture<QuerySnapshot> future = getDb().getDatabase().collection("ClientesPotenciales").get();

        List<QueryDocumentSnapshot> documents = future.get().getDocuments();

        for (DocumentSnapshot document : documents) {
            clientes.add(document.toObject(ClientePotencialEntity.class));
        }
        return clientes;
    }

    @Override
    public boolean update(ClientePotencialEntity objeto) {
        boolean update = false;

        try{
            ApiFuture<WriteResult> future = getDb().getDatabase().collection("ClientesPotenciales").document(objeto.getCedula()).set(objeto);
            update = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return update;
    }

    @Override
    public boolean delete(ClientePotencialEntity objeto) {

        getDb().getDatabase().collection("ClientesPotenciales").document(objeto.getCedula()).delete();

        return true;
    }


}
