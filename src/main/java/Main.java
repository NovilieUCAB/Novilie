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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Main extends Application {

    public static void main(String args[]) throws IOException, ExecutionException, InterruptedException {

        try{
            Conection  cnt = new Conection();


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
