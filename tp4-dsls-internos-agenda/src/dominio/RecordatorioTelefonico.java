package dominio;

public class RecordatorioTelefonico extends Recordatorio {

	@Override
	public void notificar(Notificador notificador, String nombre) {
		this.setMensaje(nombre);
		notificador.notificarViaLlamada(this);	
	}

}
