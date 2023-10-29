package application;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public aspect AspectoBackGroundColor {
	
	private ColorObservador colorObservador = new ColorObservador();
    private BackgroundColor background = new BackgroundColor();

    pointcut buttonClick(ActionEvent event):
        execution(* PrincipalController.cambiarFondo(ActionEvent)) && args(event);

    after(ActionEvent event) returning: buttonClick(event) {
        Button boton = (Button) event.getSource();
        String color = boton.getText();
        background.setObservador(colorObservador);
        background.cambioColor(color);
    }
}
