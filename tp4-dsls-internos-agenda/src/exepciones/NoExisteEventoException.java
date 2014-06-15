package exepciones;

public class NoExisteEventoException extends Exception {

	float hora;
	String nombre;
	
	public NoExisteEventoException(float hora, String nombre) {
		this.hora = hora;
		this.nombre = nombre;
	}

	
}
