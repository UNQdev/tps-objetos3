package dominio;

public interface AgendaListener {

	public void sucedio(Evento evento);
	public void notificarViaMail(String mensaje);
	public void notificarViaSMS(String mensaje);
	public void notificarViaLlamada(String mensaje);	
}
