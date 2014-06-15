package dominio;

import java.util.ArrayList;

public class Evento {
	
	float hora;
	String nombre;
	ArrayList<Recordatorio> recordatorios;
	

	public Evento(float hora, String nombreEvento) {
		this.setHora(hora);
		this.setNombre(nombreEvento);
	}
	
	
	public void notificarUsuario(Notificador notificador) {
		for(Recordatorio r : this.getRecordatorios()){
			r.notificar(notificador, this.getHora(), this.getNombre());
		}
	}
	
	
	
	public float getHora() {
		return hora;
	}

	public void setHora(float hora) {
		this.hora = hora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Recordatorio> getRecordatorios() {
		return this.recordatorios;
	}

	public void setRecordatorios(ArrayList<Recordatorio> recordatorios) {
		this.recordatorios = recordatorios;
	}


}
