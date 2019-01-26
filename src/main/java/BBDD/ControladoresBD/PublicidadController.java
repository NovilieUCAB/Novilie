package BBDD.ControladoresBD;

import BBDD.DAOImplement.PublicidadDAO;
import BBDD.ModelosBD.PublicidadEntity;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class PublicidadController {

    public PublicidadController(){
    }

    public void registrar(PublicidadEntity publicidad){
        PublicidadDAO dao = new PublicidadDAO();
        dao.create(publicidad);
    }

    public void  actualizar(PublicidadEntity publicidad){
        PublicidadDAO dao = new PublicidadDAO();
        dao.update(publicidad);
    }

    public void eliminar(PublicidadEntity publicidad){
        PublicidadDAO dao = new PublicidadDAO();
        dao.delete(publicidad);
    }

    public void verPublicidad() throws ExecutionException, InterruptedException {
        PublicidadDAO dao = new PublicidadDAO();
        List<PublicidadEntity> publicidad = dao.read();
        for (PublicidadEntity c : publicidad){
            System.out.println(c.toString());
        }
    }
}
