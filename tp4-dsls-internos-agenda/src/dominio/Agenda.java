package dominio;

import java.util.ArrayList;
import java.util.List;

import exepciones.NoExisteEventoException;
import exepciones.YaHayEventoAEsaHoraException;

public class Agenda {

public List<Evento> eventos;
	
	public Agenda(){
		this.eventos = new ArrayList<Evento>();
	}	

	public Agenda(List<Evento> eventos) {
		this.eventos = eventos;
	}
	
	public void tick(Horario horaActual, AgendaListener listener) {
		for(Evento evento : this.eventos){
			if(evento.getHorario().minutosDeDiferenciaCon(horaActual) == 5){
				listener.sucedio(evento);
			}
		}
	}
	
	//API Eventos con horario
	public void agregarEvento(Horario horario, String nombre) throws YaHayEventoAEsaHoraException {
		if(this.noExisteEvento(horario, nombre)) {
			this.eventos.add(new Evento(horario, nombre));
		}
	}
	
	public void cancelarEvento(Horario hora, String nombre) {
		try{
			this.eventos.remove(this.obtenerEvento(hora, nombre));
		} catch (NoExisteEventoException e) {}
	}
	
	private Evento obtenerEvento(Horario horario, String nombre) throws NoExisteEventoException {
		Evento evento = null;
		for(Evento e : this.eventos){
			if(e.getHorario().equals(horario) 
					&& e.getNombre().equals(nombre)) {
				evento = e;
			} else {
				throw new NoExisteEventoException(horario, nombre);
			}
		}
		return evento;
	}
	
	private boolean noExisteEvento(Horario hora, String nombre) {
		boolean existe = true;
		for(Evento evento : this.eventos) {
			existe = !(evento.getHorario().equals(hora) && evento.getNombre().equals(nombre));
		}
		return existe;
	}

}
