package dominio;

import java.util.ArrayList;

import exepciones.NoHayEventoException;
import exepciones.YaHayEventoAEsaHoraException;

public class Agenda {

	ArrayList<Evento> eventos;
	
	public Agenda(){}	
	
	
	public void tick(int horaActual, AgendaListener listener) {
		for(Evento event : this.eventos){
			if(event.getHora() == horaActual){
				listener.sucedio(event);
			}
		}
	}
	
	
	//API Eventos con horario
	public void agregarEvento(float hora, String nombre) throws YaHayEventoAEsaHoraException {
		if(this.NoExisteEvento(hora, nombre)) {
			this.eventos.add(new Evento(hora, nombre));
		}
	}
	
	public void cancelarEvento(float hora, String nombre) {
		try{
			this.eventos.remove(this.obtenerEvento(hora, nombre));
		} catch (NoHayEventoException e) {}
	}
	
	private Evento obtenerEvento(float hora, String nombre) throws NoHayEventoException {
		Evento evento = null;
		for(Evento event : this.eventos){
			if(event.getHora() == hora 
					&& event.getNombre().equals(nombre)) {
				evento = event;
			} else {
				throw new NoHayEventoException(hora, nombre);
			}
		}
		return evento;
	}
	private boolean NoExisteEvento(float hora, String nombre) {
		boolean existe = true;
		for(Evento event : this.eventos) {
			existe = !(event.getHora() == hora && event.getNombre().equals(nombre));
		}
		return existe;
	}

}
