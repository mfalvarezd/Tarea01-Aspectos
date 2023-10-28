package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.event.ActionEvent;

import javafx.scene.layout.BorderPane;

public class PrincipalController {
	@FXML
	private BorderPane contenedor;
	@FXML
	private Button botonRojo;
	@FXML
	private Button botonVerde;
	@FXML
	private Button botonAzul;

	// Event Listener on Button[#botonRojo].onAction
	
	@FXML
    void cambiarFondo(ActionEvent event) {
        Button boton = (Button) event.getSource();
        String botonId = boton.getId();
        

        switch (botonId) {
            case "botonRojo":
            	
                contenedor.setStyle("-fx-background-color: red;");
                break;
            case "botonVerde":
                contenedor.setStyle("-fx-background-color: green;");
                break;
            case "botonAzul":
                contenedor.setStyle("-fx-background-color: blue;");
                break;
        }

        System.out.println("Nuevo color de fondo: " + boton.getText());
    }// TODO Autogenerated
	
}
