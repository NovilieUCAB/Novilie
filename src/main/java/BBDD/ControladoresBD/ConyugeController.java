package BBDD.ControladoresBD;

import BBDD.DAOImplement.ConyugeDAO;
import BBDD.ModelosBD.ConyugeEntity;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class ConyugeController {

    public ConyugeController(){
    }

    public void registrar(ConyugeEntity conyuge){
        ConyugeDAO dao = new ConyugeDAO();
        dao.create(conyuge);
    }

    public void  actualizar(ConyugeEntity conyuge){
        ConyugeDAO dao = new ConyugeDAO();
        dao.update(conyuge);
    }

    public void eliminar(ConyugeEntity conyuge){
        ConyugeDAO dao = new ConyugeDAO();
        dao.delete(conyuge);
    }

    public void verConyuges() throws ExecutionException, InterruptedException {
        ConyugeDAO dao = new ConyugeDAO();
        List<ConyugeEntity> conyuges = dao.read();
        for (ConyugeEntity c : conyuges){
            System.out.println(c.toString());
        }
    }
}
