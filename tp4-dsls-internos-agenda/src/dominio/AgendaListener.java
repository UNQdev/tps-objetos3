package dominio;

public interface AgendaListener {

	public void sucedio(Evento evento);
	public void notificarViaMail(Recordatorio recordatorioMail);
	public void notificarViaSMS(Recordatorio recordatorioSMS);
	public void notificarViaLlamada(Recordatorio recordatorioTelefonico);	
}
