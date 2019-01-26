import BBDD.Conection;
import BBDD.DAOImplement.*;
import BBDD.Fecha;
import BBDD.ModelosBD.*;
import BBDD.Telefono;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Main extends Application {

    public static void main(String args[]) throws IOException {

        FileInputStream serviceAccount =
                new FileInputStream("novilie-firebase-adminsdk-od77w-74a1f74d4a.json");
        try{
            Conection  cnt = new Conection();
        FirebaseApp.initializeApp(options);


            List<PublicidadEntity> lt =null ;

            for(PublicidadEntity doc :lt){
                System.out.println(doc.getUrlBase());
            }


        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
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
