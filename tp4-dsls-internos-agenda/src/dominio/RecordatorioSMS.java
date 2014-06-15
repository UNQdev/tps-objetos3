package dominio;

public class RecordatorioSMS extends Recordatorio {

	@Override
	public void notificar(Notificador notificador, String nombre) {
		this.setMensaje(nombre);
		notificador.notificarViaSMS(this);		
	}

}
