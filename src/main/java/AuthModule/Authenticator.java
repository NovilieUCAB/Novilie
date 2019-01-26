package AuthModule;

import BBDD.ModelosBD.UsuarioSistemaEntity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;

public class Authenticator {

    private final FirebaseAuth auth = FirebaseAuth.getInstance();

    public Authenticator (){

    }

    public void createUser(UsuarioSistemaEntity user){
        UserRecord.CreateRequest req = new UserRecord.CreateRequest()
                .setUid("123456")
                .setEmail("adrianluces111@gmail.com")
                .setPassword("123456");

        try {
            UserRecord record = auth.createUser(req);
        } catch (FirebaseAuthException e) {
            e.printStackTrace();
        }

    }

    public void deleteUser(UsuarioSistemaEntity user){
        try {
            auth.deleteUser("dr23");
        } catch (FirebaseAuthException e) {
            e.printStackTrace();
        }

    }

    public Boolean validate (String mail , String pass){
        boolean found = false;
        UserRecord record = null;

        try {
            record = auth.getUser(pass);
        } catch (FirebaseAuthException e) {
            e.printStackTrace();
        }

        System.out.println(record.getEmail());

        if((record.getEmail().equals(mail)))
            found = true;
        else
            found = false;


        return found;
    }

}
