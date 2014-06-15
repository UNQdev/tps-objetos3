package dominio;

import java.util.ArrayList;

public class Notificador implements AgendaListener {

	private ArrayList<Recordatorio> logRecordatorios;
	
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

	
	public ArrayList<Recordatorio> getLogRecordatorios() {
		return logRecordatorios;
	}

	public void setLogRecordatorios(ArrayList<Recordatorio> logRecordatorios) {
		this.logRecordatorios = logRecordatorios;
	}

}
