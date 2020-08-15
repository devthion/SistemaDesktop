package application;

import java.util.Optional;

import Herramientas.Alerta;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class InicioSesion {

    @FXML
    private TextField txtContrasenia;

    @FXML
    private Button btnSalir;

    @FXML
    private TextField txtNombreUsuario;

    @FXML
    private Button btnIngresar;

    @FXML
    void onIngresarClick(ActionEvent event) {
    	new MostrarPantalla().mostrarYCerrar("VerProductos.fxml", "Menu Principal",btnIngresar.getScene().getWindow());
    }

    @FXML
    void onSalirClick(ActionEvent event) {
    	Optional<ButtonType> action =  new Alerta().preguntaConfirmacion("¿Desea salir del sistema?", "Confirmación");
    	if (action.get() == ButtonType.OK) {
    		System.exit(0);
    	}
    }

}
