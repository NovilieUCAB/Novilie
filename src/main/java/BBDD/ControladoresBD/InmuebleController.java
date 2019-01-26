package BBDD.ControladoresBD;

import BBDD.DAOImplement.InmuebleDAO;
import BBDD.ModelosBD.InmuebleEntity;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class InmuebleController {
    
    public InmuebleController(){
    }

    public void registrar(InmuebleEntity inmueble){
        InmuebleDAO dao = new InmuebleDAO();
        dao.create(inmueble);
    }

    public void  actualizar(InmuebleEntity inmueble){
        InmuebleDAO dao = new InmuebleDAO();
        dao.update(inmueble);
    }

    public void eliminar(InmuebleEntity inmueble){
        InmuebleDAO dao = new InmuebleDAO();
        dao.delete(inmueble);
    }

    public void verInmuebles() throws ExecutionException, InterruptedException {
        InmuebleDAO dao = new InmuebleDAO();
        List<InmuebleEntity> inmuebles = dao.read();
        for (InmuebleEntity c : inmuebles){
            System.out.println(c.toString());
        }
    }
}
