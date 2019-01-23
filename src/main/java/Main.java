import BBDD.Conection;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class Main extends Application {

    public static void main(String args[]) throws IOException, ExecutionException, InterruptedException {

        try{
            Conection db = new Conection();

            // Create a Map to store the data we want to set
            /*Map<String, Object> docData = new HashMap<>();
            docData.put("name", "Los Angeles");
            docData.put("state", "CA");
            docData.put("country", "USA");*/

            // Add a new document (asynchronously) in collection "cities" with id "LA"
            //ApiFuture<WriteResult> future = db.getDatabase().collection("cities").document("LA").set(docData);

        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
}
