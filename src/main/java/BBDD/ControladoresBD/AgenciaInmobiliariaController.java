package BBDD.ControladoresBD;

import BBDD.DAOImplement.AgenciaInmobiliariaDAO;
import BBDD.ModelosBD.AgenciaInmobiliariaEntity;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class AgenciaInmobiliariaController {

    public AgenciaInmobiliariaController(){
    }

    public void registrar(AgenciaInmobiliariaEntity agencia){
        AgenciaInmobiliariaDAO dao = new AgenciaInmobiliariaDAO();
        dao.create(agencia);
    }

    public void  actualizar(AgenciaInmobiliariaEntity agencia){
        AgenciaInmobiliariaDAO dao = new AgenciaInmobiliariaDAO();
        dao.update(agencia);
    }

    public void eliminar(AgenciaInmobiliariaEntity agencia){
        AgenciaInmobiliariaDAO dao = new AgenciaInmobiliariaDAO();
        dao.delete(agencia);
    }

    public void verAgencias() throws ExecutionException, InterruptedException {
        AgenciaInmobiliariaDAO dao = new AgenciaInmobiliariaDAO();
        List<AgenciaInmobiliariaEntity> agencias = dao.read();
        for (AgenciaInmobiliariaEntity c : agencias){
            System.out.println(c.toString());
        }
    }
}
