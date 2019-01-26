import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
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
    public void loginAction() throws IOException {

            Stage navegador = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Navegador.fxml"));
            Scene scene = new Scene(root,1080, 720);
            navegador.setScene(scene);
            navegador.initStyle(StageStyle.UNDECORATED);
            navegador.show();
            navegador.setResizable(false);


        Iniciar_Sesion.getScene().getWindow().hide();
        System.out.println("Hola");

        }


}
