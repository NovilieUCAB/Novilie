package BBDD.ControladoresBD;

import BBDD.DAOImplement.ClientePotencialDAO;
import BBDD.ModelosBD.ClientePotencialEntity;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class ClientePotencialController {


    public ClientePotencialController(){
    }

    public void registrar(ClientePotencialEntity cliente){
        ClientePotencialDAO dao = new ClientePotencialDAO();
        dao.create(cliente);
    }

    public void  actualizar(ClientePotencialEntity cliente){
        ClientePotencialDAO dao = new ClientePotencialDAO();
        dao.update(cliente);
    }

    public void eliminar(ClientePotencialEntity cliente){
        ClientePotencialDAO dao = new ClientePotencialDAO();
        dao.delete(cliente);
    }

    public void verClientes() throws ExecutionException, InterruptedException {
        ClientePotencialDAO dao = new ClientePotencialDAO();
        List<ClientePotencialEntity> clientes = dao.read();
        for (ClientePotencialEntity c : clientes){
            System.out.println(c.toString());
        }
    }
}
