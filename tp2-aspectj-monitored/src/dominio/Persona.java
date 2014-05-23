package dominio;

import annotations.Monitored;

@Monitored
public class Persona {

	@Monitored
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
 