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
                .setUid("dr23")
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

}
