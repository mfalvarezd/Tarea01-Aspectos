package application;

public class BackgroundColor {
	private ColorObservador observador;

	
	public void cambioColor(String color) {
        
        observador.notificacion(color);
    }

	public void setObservador(ColorObservador observador) {
		this.observador = observador;
	}


}
