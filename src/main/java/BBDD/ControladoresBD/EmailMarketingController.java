package BBDD.ControladoresBD;

import BBDD.DAOImplement.EmailMarketingDAO;
import BBDD.ModelosBD.EmailMarketingEntity;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class EmailMarketingController {

    public EmailMarketingController(){
    }

    public void registrar(EmailMarketingEntity emailMarketing){
        EmailMarketingDAO dao = new EmailMarketingDAO();
        dao.create(emailMarketing);
    }

    public void  actualizar(EmailMarketingEntity emailMarketing){
        EmailMarketingDAO dao = new EmailMarketingDAO();
        dao.update(emailMarketing);
    }

    public void eliminar(EmailMarketingEntity emailMarketing){
        EmailMarketingDAO dao = new EmailMarketingDAO();
        dao.delete(emailMarketing);
    }

    public void verEmailMarketings() throws ExecutionException, InterruptedException {
        EmailMarketingDAO dao = new EmailMarketingDAO();
        List<EmailMarketingEntity> emailMarketings = dao.read();
        for (EmailMarketingEntity c : emailMarketings){
            System.out.println(c.toString());
        }
    }
}
