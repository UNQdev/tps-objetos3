package dominio;

public class Notificador implements AgendaListener {

	
	
	public void sucedio(Evento evento) {
		for(Recordatorio recordatorio : evento.getRecordatorios()){
			recordatorio.notificarUsuario();
		}
	}

	public void notificarViaMail(String mensaje) {
		// TODO Auto-generated method stub
		
	}

	public void notificarViaSMS(String mensaje) {
		// TODO Auto-generated method stub

	}

	public void notificarViaLlamada(String mensaje) {
		// TODO Auto-generated method stub

	}

}
