package dominio;

public class RecordatorioTelefonico extends Recordatorio {

	public RecordatorioTelefonico(double horaEvento, String nombre) {
		this.hidratar(horaEvento, nombre);
	}
	
	@Override
	public void notificar(Notificador notificador) {
		notificador.notificarViaLlamada(this);		
	}

}
