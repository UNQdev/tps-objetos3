package dominio;

public class RecordatorioTelefonico extends Recordatorio {

	@Override
	public void notificar(Notificador notificador, float horaEvento, String nombre) {
		this.hidratar(horaEvento, nombre);
		notificador.notificarViaLlamada(this);	
	}

}
