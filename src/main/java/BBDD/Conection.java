package BBDD;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.storage.Bucket;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.cloud.StorageClient;

import java.io.FileInputStream;
import java.io.IOException;

public class Conection {
    public static Firestore database;
    public static Bucket CloudStorage;

    public Conection() throws IOException {
        FileInputStream serviceAccount =
                new FileInputStream("novilie-firebase-adminsdk-od77w-74a1f74d4a.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://novilie.firebaseio.com")
                .setStorageBucket("novilie.appspot.com")
                .build();

        FirebaseApp.initializeApp(options);

        this.database = FirestoreClient.getFirestore();
        this.CloudStorage = StorageClient.getInstance().bucket();
    }

    public Firestore getDatabase() {
        return database;
    }
}
