package BBDD.DAOImplement;

import BBDD.Conection;
import BBDD.ModelosBD.AgenciaInmobiliariaEntity;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class AgenciaInmobiliariaDAO implements IDAO<AgenciaInmobiliariaEntity> {

    private static Conection db;

    private static Conection getDb() {
        return db;
    }

    private static void setDb(Conection db) {
        AgenciaInmobiliariaDAO.db = db;
    }

    static {
        try {
            setDb(new Conection());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean create(AgenciaInmobiliariaEntity objeto) {
        boolean create = false;
        try{
            ApiFuture<WriteResult> future = getDb().getDatabase().collection("Agencia").document(objeto.getNombreAgencia()).set(objeto);
            System.out.println(future.get().getUpdateTime());
            create = true;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return create;
    }

    @Override
    public List<AgenciaInmobiliariaEntity> read() throws ExecutionException, InterruptedException {
        List<AgenciaInmobiliariaEntity> agencias = new ArrayList<>();

        ApiFuture<QuerySnapshot> future = getDb().getDatabase().collection("Agencia").get();

        List<QueryDocumentSnapshot> documents = future.get().getDocuments();

        for (DocumentSnapshot document : documents) {
            agencias.add(document.toObject(AgenciaInmobiliariaEntity.class));
        }
        return agencias;
    }

    @Override
    public boolean update(AgenciaInmobiliariaEntity objeto) {
        boolean update = false;
        try{
            ApiFuture<WriteResult> future = getDb().getDatabase().collection("Agencia").document(objeto.getNombreAgencia()).set(objeto);
            update = true;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return update;
    }

    @Override
    public boolean delete(AgenciaInmobiliariaEntity objeto) {
        ApiFuture<WriteResult> future = getDb().getDatabase().collection("Agencia").document(objeto.getNombreAgencia()).delete();
        return true;
    }
}
