package BBDD.ControladoresBD;

import BBDD.DAOImplement.AsesorInmobiliarioDAO;
import BBDD.ModelosBD.AsesorInmobiliarioEntity;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class AsesorInmobiliarioController {

    public AsesorInmobiliarioController(){
    }

    public void registrar(AsesorInmobiliarioEntity asesor){
        AsesorInmobiliarioDAO dao = new AsesorInmobiliarioDAO();
        dao.create(asesor);
    }

    public void  actualizar(AsesorInmobiliarioEntity asesor){
        AsesorInmobiliarioDAO dao = new AsesorInmobiliarioDAO();
        dao.update(asesor);
    }

    public void eliminar(AsesorInmobiliarioEntity asesor){
        AsesorInmobiliarioDAO dao = new AsesorInmobiliarioDAO();
        dao.delete(asesor);
    }

    public void verAsesores() throws ExecutionException, InterruptedException {
        AsesorInmobiliarioDAO dao = new AsesorInmobiliarioDAO();
        List<AsesorInmobiliarioEntity> asesores = dao.read();
        for (AsesorInmobiliarioEntity c : asesores){
            System.out.println(c.toString());
        }
    }
}
