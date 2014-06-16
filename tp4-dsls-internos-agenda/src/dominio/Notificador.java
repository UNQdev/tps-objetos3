package dominio;

import java.util.ArrayList;
import java.util.List;

public class Notificador implements AgendaListener {

	private List<Recordatorio> logRecordatorios;
	
	public Notificador(){
		this.setLogRecordatorios(new ArrayList<Recordatorio>());
	}
	
	public void sucedio(Evento evento) {
		evento.notificarUsuario(this);
	}

	
	public void notificarViaMail(Recordatorio recordatorioEmail) {
		this.getLogRecordatorios().add(recordatorioEmail);
	}

	public void notificarViaSMS(Recordatorio recordatorioSMS) {
		this.getLogRecordatorios().add(recordatorioSMS);
	}

	public void notificarViaLlamada(Recordatorio recordatorioTelefonico) {
		this.getLogRecordatorios().add(recordatorioTelefonico);
	}
	

	public void printLog() {
		for(Recordatorio record : this.getLogRecordatorios()){
			System.out.println(record.toString());
		}
	}
	
	public List<Recordatorio> getLogRecordatorios() {
		return logRecordatorios;
	}

	public void setLogRecordatorios(List<Recordatorio> logRecordatorios) {
		this.logRecordatorios = logRecordatorios;
	}
	
}
