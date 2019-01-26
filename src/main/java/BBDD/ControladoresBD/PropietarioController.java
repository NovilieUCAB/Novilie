package BBDD.ControladoresBD;

import BBDD.DAOImplement.PropietarioDAO;
import BBDD.ModelosBD.ClientePropietarioEntity;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class PropietarioController {

    public PropietarioController(){
    }

    public void registrar(ClientePropietarioEntity propietario){
        PropietarioDAO dao = new PropietarioDAO();
        dao.create(propietario);
    }

    public void  actualizar(ClientePropietarioEntity propietario){
        PropietarioDAO dao = new PropietarioDAO();
        dao.update(propietario);
    }

    public void eliminar(ClientePropietarioEntity propietario){
        PropietarioDAO dao = new PropietarioDAO();
        dao.delete(propietario);
    }

    public void verPropietarios() throws ExecutionException, InterruptedException {
        PropietarioDAO dao = new PropietarioDAO();
        List<ClientePropietarioEntity> propietarios = dao.read();
        for (ClientePropietarioEntity c : propietarios){
            System.out.println(c.toString());
        }
    }
}
