package BBDD.DAOImplement;

import BBDD.Conection;
import BBDD.ModelosBD.ClientePropietarioEntity;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class PropietarioDAO implements IDAO<ClientePropietarioEntity> {
    private static Conection db;

    private static Conection getDb() {
        return db;
    }

    private static void setDb(Conection db) {
        PropietarioDAO.db = db;
    }

    static {
        try {
            setDb(new Conection());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public boolean create(ClientePropietarioEntity objeto) {
        boolean create = false;

        try{

            ApiFuture<WriteResult> future = getDb().getDatabase().collection("Propietarios").document(objeto.getCedula()).set(objeto);
            System.out.println(future.get().getUpdateTime());
            create = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return create;
    }

    @Override
    public List<ClientePropietarioEntity> read() throws ExecutionException, InterruptedException {

        List<ClientePropietarioEntity> clientes = new ArrayList<>();

        ApiFuture<QuerySnapshot> future = getDb().getDatabase().collection("Propietarios").get();

        List<QueryDocumentSnapshot> documents = future.get().getDocuments();

        for (DocumentSnapshot document : documents) {
            clientes.add(document.toObject(ClientePropietarioEntity.class));
        }
        return clientes;
    }

    @Override
    public boolean update(ClientePropietarioEntity objeto) {
        boolean update = false;

        try{
            ApiFuture<WriteResult> future = getDb().getDatabase().collection("Propietarios").document(objeto.getCedula()).set(objeto);
            update = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return update;
    }

    @Override
    public boolean delete(ClientePropietarioEntity objeto) {

        getDb().getDatabase().collection("Propietarios").document(objeto.getCedula()).delete();

        return true;
    }
}
