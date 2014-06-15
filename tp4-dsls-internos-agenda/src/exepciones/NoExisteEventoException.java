package exepciones;

public class NoHayEventoException extends Exception {

	float hora;
	String nombre;
	
	public NoHayEventoException(float hora, String nombre) {
		this.hora = hora;
		this.nombre = nombre;
	}

	
}
