import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NavegadorController implements Initializable {

    @FXML
    private AnchorPane holderPane;

    AnchorPane ventana;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Se abrio Navegador");
        createPage();
    }

    private void setNode(Node node){
        holderPane.getChildren().clear();
        holderPane.getChildren().add((Node) node);

        FadeTransition ft = new FadeTransition(Duration.millis(150));
        ft.setNode(node);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    private void createPage(){
        try {
            ventana = FXMLLoader.load(getClass().getResource("Propiedades.fxml"));
            setNode(ventana);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void asesores(){
        try {
            ventana = FXMLLoader.load(getClass().getResource("Asesores.fxml"));
            setNode(ventana);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void propiedades(){
        try {
            ventana = FXMLLoader.load(getClass().getResource("Propiedades.fxml"));
            setNode(ventana);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
