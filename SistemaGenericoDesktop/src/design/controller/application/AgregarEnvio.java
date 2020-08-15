package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AgregarEnvio {

    @FXML
    private TextField lblCodigoPostal;

    @FXML
    private TableColumn<?, ?> colDireccion;

    @FXML
    private Button btnRealizarVenta;

    @FXML
    private Button btnNuevoCliente;

    @FXML
    private TextField txtBuscarCliente;

    @FXML
    private TextField lblBarrio;

    @FXML
    private Button btnCancelarEnvio;

    @FXML
    private TableColumn<?, ?> colNombre;

    @FXML
    private TableView<?> tblClientes;

    @FXML
    private TextField lblDireccion;

    @FXML
    void onNuevoClienteClick(ActionEvent event) {

    }

    @FXML
    void onRealizarVentaClick(ActionEvent event) {
    	new MostrarPantalla().abandonarVentana(btnRealizarVenta.getScene().getWindow());
    }

    @FXML
    void onCancelarEnvioClick(ActionEvent event) {
    	new MostrarPantalla().abandonarVentana(btnRealizarVenta.getScene().getWindow());
    }

}
