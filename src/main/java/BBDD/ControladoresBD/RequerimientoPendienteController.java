package BBDD.ControladoresBD;

import BBDD.DAOImplement.RequerimientoPendienteDAO;
import BBDD.ModelosBD.RequerimientoPendienteEntity;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class RequerimientoPendienteController {

    public RequerimientoPendienteController(){
    }

    public void registrar(RequerimientoPendienteEntity requerimientoPendiente){
        RequerimientoPendienteDAO dao = new RequerimientoPendienteDAO();
        dao.create(requerimientoPendiente);
    }

    public void  actualizar(RequerimientoPendienteEntity requerimientoPendiente){
        RequerimientoPendienteDAO dao = new RequerimientoPendienteDAO();
        dao.update(requerimientoPendiente);
    }

    public void eliminar(RequerimientoPendienteEntity requerimientoPendiente){
        RequerimientoPendienteDAO dao = new RequerimientoPendienteDAO();
        dao.delete(requerimientoPendiente);
    }

    public void verRequerimientosPendientes() throws ExecutionException, InterruptedException {
        RequerimientoPendienteDAO dao = new RequerimientoPendienteDAO();
        List<RequerimientoPendienteEntity> requerimientoPendiente = dao.read();
        for (RequerimientoPendienteEntity c : requerimientoPendiente){
            System.out.println(c.toString());
        }
    }
}
