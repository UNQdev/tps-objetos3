package dominio;

import java.util.ArrayList;
import java.util.List;

public class Evento {
	
	Horario horario;
	String nombre;
	List<Recordatorio> recordatorios;

	public Evento(Horario horario, String nombreEvento) {
		this.setHorario(horario);
		this.setNombre(nombreEvento);
		this.recordatorios = new ArrayList<Recordatorio>();
	}
	
	public void notificarUsuario(Notificador notificador) {
		for(Recordatorio r : this.getRecordatorios()){
			r.notificar(notificador);
		}
	}
	
	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
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
	
	public List<Recordatorio> getRecordatorios() {
		return this.recordatorios;
	}

	public void setRecordatorios(List<Recordatorio> recordatorios) {
		this.recordatorios = recordatorios;
	}
}
