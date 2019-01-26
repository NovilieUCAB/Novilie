import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class PropiedadesController implements Initializable {


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Se abrio propiedades");
    }


    @FXML
    public void abrirPropiedad(){
        System.out.println("Abrir Propiedad");
    }

}
