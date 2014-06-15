package dominio;

import java.util.ArrayList;

public class Evento {
	
	double hora;
	String nombre;
	ArrayList<Recordatorio> recordatorios;
	

	public Evento(double hora, String nombreEvento) {
		this.setHora(hora);
		this.setNombre(nombreEvento);
	}
	
	
	public void notificarUsuario(Notificador notificador) {
		for(Recordatorio r : this.getRecordatorios()){
			r.notificar(notificador);
		}
	}

	
	public double getHora() {
		return hora;
	}

	public void setHora(double hora) {
		this.hora = hora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public void agregarRecordatorio(Recordatorio recordatorio) {
		this.recordatorios.add(recordatorio);
	}
	
	public ArrayList<Recordatorio> getRecordatorios() {
		return this.recordatorios;
	}

	public void setRecordatorios(ArrayList<Recordatorio> recordatorios) {
		this.recordatorios = recordatorios;
	}


}
