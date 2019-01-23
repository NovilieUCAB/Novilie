import BBDD.Conection;
import BBDD.DAOImplement.ClienteDAO;
import BBDD.Fecha;
import BBDD.ModelosBD.ClienteEntity;
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
            List<Telefono> tlf = new ArrayList<>();
            tlf.add(new Telefono("0414-8911462"));
            ClienteEntity cliente = new ClienteEntity("28240553","Tania","Riobueno",new Fecha(8,4,1999),"tanialita2308@gmail.com",tlf,"Estudiante","","","Bolivar","Puerto Ordaz","Villa Colombia");
            ClienteDAO clienteD = new ClienteDAO();
            clienteD.create(cliente);
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
