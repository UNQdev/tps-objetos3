package dominio;

public class RecordatorioEmail extends Recordatorio {

	@Override
	public void notificar(Notificador notificador, float horaEvento, String nombre) {
		this.hidratar(horaEvento, nombre);
		notificador.notificarViaMail(this);
	}

}
