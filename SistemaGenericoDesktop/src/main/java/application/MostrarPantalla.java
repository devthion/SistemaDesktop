package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class MostrarPantalla {
	
	public void mostrarYCerrar(String pantalla, String titulo, Window window) {
    	try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource(pantalla));
			BorderPane root = (BorderPane) loader.load();
			Scene scene = new Scene(root,1400,700);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setMaximized(true);
//			stage.setFullScreen(true);
//			stage.resizableProperty().setValue(Boolean.FALSE);
//			stage.setResizable(false);
			stage.setTitle(titulo);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
    	Stage stage = (Stage) window;
    	stage.close();
	}
	public void mostrar(String pantalla, String titulo, Window window,int dimensionX, int dimensionY) {
    	try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource(pantalla));
			BorderPane root = (BorderPane) loader.load();
			Scene scene = new Scene(root,dimensionX,dimensionY);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.resizableProperty().setValue(Boolean.FALSE);
			stage.setResizable(false);
			stage.setTitle(titulo);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void abandonarVentana(Window window) {
    	Stage stage = (Stage) window;
    	stage.close();
	}
}
