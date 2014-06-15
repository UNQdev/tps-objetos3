package dominio;

public class RecordatorioEmail extends Recordatorio {

	public RecordatorioEmail(double horaEvento, String nombre) {
		this.hidratar(horaEvento, nombre);
	}
	
	@Override
	public void notificar(Notificador notificador) {
		notificador.notificarViaMail(this);
	}

}
