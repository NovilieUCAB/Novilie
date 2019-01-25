package BBDD;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

import java.io.FileInputStream;
import java.io.IOException;

public class Conection {
    public static Firestore database;

    public Conection() throws IOException {
        FileInputStream serviceAccount =
                new FileInputStream("novilie-firebase-adminsdk-od77w-74a1f74d4a.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://novilie.firebaseio.com")
                .build();

        FirebaseApp.initializeApp(options);

        this.database = FirestoreClient.getFirestore();
    }

    public Firestore getDatabase() {
        return database;
    }
}
