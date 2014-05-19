package dominio;

import annotations.Monitored;


public class Persona {

	String nombre;
	
	public Persona(){};
	
	public Persona(String nombre){
		this.nombre = nombre;
	}
	
	@Monitored
	public String getNombre() { return nombre; }
	@Monitored
	public void setNombre(String nombre) { this.nombre = nombre; };
	
}
