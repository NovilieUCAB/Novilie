package Controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {


    @FXML
    private ImageView Imagen;

    @FXML
    private JFXTextField Correo;

    @FXML
    private JFXPasswordField Contraseña;

    @FXML
    private JFXButton Iniciar_Sesion;

    @FXML
    private JFXButton Registrarse;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void loginAction() {
        System.out.println("Hola");
    }

}
