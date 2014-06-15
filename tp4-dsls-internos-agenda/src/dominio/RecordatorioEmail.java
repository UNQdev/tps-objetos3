package dominio;

public class RecordatorioEmail extends Recordatorio {

	@Override
	public void notificar(Notificador notificador, String nombre) {
		this.setMensaje(nombre);
		notificador.notificarViaMail(this);		
	}

}
