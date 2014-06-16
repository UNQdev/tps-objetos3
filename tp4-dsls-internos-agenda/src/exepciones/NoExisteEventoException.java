package exepciones;

import dominio.Horario;

public class NoExisteEventoException extends Exception {

	Horario hora;
	String nombre;
	
	public NoExisteEventoException(Horario hora, String nombre) {
		this.hora = hora;
		this.nombre = nombre;
	}

	
}
