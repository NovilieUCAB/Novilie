package BBDD.DAOImplement;

import BBDD.Conection;
import BBDD.ModelosBD.ClienteEntity;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.WriteResult;

import java.io.IOException;
import java.util.List;

public class ClienteDAO implements IDAO<ClienteEntity> {

    @Override
    public boolean create(ClienteEntity objeto) {
        boolean create = false;

        try{
            Conection db = new Conection();
            ApiFuture<WriteResult> future = db.getDatabase().collection("Clientes").document(objeto.getCedula()).set(objeto);
            create = true;
        }catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return create;
    }

    @Override
    public List<ClienteEntity> read() {
        return null;
    }

    @Override
    public boolean update(ClienteEntity objeto) {
        return false;
    }

    @Override
    public boolean delete(ClienteEntity objeto) {
        return false;
    }


}
