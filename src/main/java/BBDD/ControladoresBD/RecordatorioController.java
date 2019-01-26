package BBDD.ControladoresBD;

import BBDD.DAOImplement.RecordatorioDAO;
import BBDD.ModelosBD.RecordatorioEntity;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class RecordatorioController {

    public RecordatorioController(){
    }

    public void registrar(RecordatorioEntity recordatorio){
        RecordatorioDAO dao = new RecordatorioDAO();
        dao.create(recordatorio);
    }

    public void  actualizar(RecordatorioEntity recordatorio){
        RecordatorioDAO dao = new RecordatorioDAO();
        dao.update(recordatorio);
    }

    public void eliminar(RecordatorioEntity recordatorio){
        RecordatorioDAO dao = new RecordatorioDAO();
        dao.delete(recordatorio);
    }

    public void verRecordatorios() throws ExecutionException, InterruptedException {
        RecordatorioDAO dao = new RecordatorioDAO();
        List<RecordatorioEntity> recordatorios = dao.read();
        for (RecordatorioEntity c : recordatorios){
            System.out.println(c.toString());
        }
    }
}
