package BBDD.ControladoresBD;

import BBDD.DAOImplement.UsuarioSistemaDAO;
import BBDD.ModelosBD.UsuarioSistemaEntity;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class UsuarioSistemaController {

    public UsuarioSistemaController(){
    }

    public void registrar(UsuarioSistemaEntity usuarioSistema){
        UsuarioSistemaDAO dao = new UsuarioSistemaDAO();
        dao.create(usuarioSistema);
    }

    public void  actualizar(UsuarioSistemaEntity usuarioSistema){
        UsuarioSistemaDAO dao = new UsuarioSistemaDAO();
        dao.update(usuarioSistema);
    }

    public void eliminar(UsuarioSistemaEntity usuarioSistema){
        UsuarioSistemaDAO dao = new UsuarioSistemaDAO();
        dao.delete(usuarioSistema);
    }

    public void verUsuariosSistema() throws ExecutionException, InterruptedException {
        UsuarioSistemaDAO dao = new UsuarioSistemaDAO();
        List<UsuarioSistemaEntity> usuariosSistema = dao.read();
        for (UsuarioSistemaEntity c : usuariosSistema){
            System.out.println(c.toString());
        }
    }
}
