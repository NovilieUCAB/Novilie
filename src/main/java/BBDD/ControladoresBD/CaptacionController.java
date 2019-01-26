package BBDD.ControladoresBD;

import BBDD.DAOImplement.CaptacionDAO;
import BBDD.ModelosBD.CaptacionEntity;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class CaptacionController {

    public CaptacionController(){
    }

    public void registrar(CaptacionEntity captacion){
        CaptacionDAO dao = new CaptacionDAO();
        dao.create(captacion);
    }

    public void  actualizar(CaptacionEntity captacion){
        CaptacionDAO dao = new CaptacionDAO();
        dao.update(captacion);
    }

    public void eliminar(CaptacionEntity captacion){
        CaptacionDAO dao = new CaptacionDAO();
        dao.delete(captacion);
    }

    public void verCaptaciones() throws ExecutionException, InterruptedException {
        CaptacionDAO dao = new CaptacionDAO();
        List<CaptacionEntity> captacions = dao.read();
        for (CaptacionEntity c : captacions){
            System.out.println(c.toString());
        }
    }
}
