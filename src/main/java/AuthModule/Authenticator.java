package AuthModule;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.UserRecord;

public class Authenticator {

    private final FirebaseAuth auth = FirebaseAuth.getInstance();

    public Authenticator (){

    }

    public void createUser(){
        UserRecord.CreateRequest req = new UserRecord.CreateRequest();


    }

}
