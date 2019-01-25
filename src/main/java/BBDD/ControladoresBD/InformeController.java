package BBDD.ControladoresBD;

import BBDD.DAOImplement.InformeDAO;
import BBDD.ModelosBD.InformeEntity;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class InformeController {

    public InformeController(){
    }

    public void registrar(InformeEntity informe){
        InformeDAO dao = new InformeDAO();
        dao.create(informe);
    }

    public void  actualizar(InformeEntity informe){
        InformeDAO dao = new InformeDAO();
        dao.update(informe);
    }

    public void eliminar(InformeEntity informe){
        InformeDAO dao = new InformeDAO();
        dao.delete(informe);
    }

    public void verInformes() throws ExecutionException, InterruptedException {
        InformeDAO dao = new InformeDAO();
        List<InformeEntity> informes = dao.read();
        for (InformeEntity c : informes){
            System.out.println(c.toString());
        }
    }
}
