package BBDD.ControladoresBD;

import BBDD.DAOImplement.VisitaDAO;
import BBDD.ModelosBD.VisitaEntity;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class VisitaController {

    public VisitaController(){
    }

    public void registrar(VisitaEntity visita){
        VisitaDAO dao = new VisitaDAO();
        dao.create(visita);
    }

    public void  actualizar(VisitaEntity visita){
        VisitaDAO dao = new VisitaDAO();
        dao.update(visita);
    }

    public void eliminar(VisitaEntity visita){
        VisitaDAO dao = new VisitaDAO();
        dao.delete(visita);
    }

    public void verVisitas() throws ExecutionException, InterruptedException {
        VisitaDAO dao = new VisitaDAO();
        List<VisitaEntity> visitas = dao.read();
        for (VisitaEntity c : visitas){
            System.out.println(c.toString());
        }
    }
}
