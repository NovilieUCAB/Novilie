import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {
    public static void main(String args[]) throws IOException {

/*
        FileInputStream serviceAccount =
                new FileInputStream("novilie-firebase-adminsdk-od77w-74a1f74d4a.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://novilie.firebaseio.com")
                .build();

        FirebaseApp.initializeApp(options);
*/

        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        primaryStage.setTitle("Novilie");
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.centerOnScreen();
        primaryStage.setScene(new Scene(root, 420, 420));
        primaryStage.show();
    }
}
