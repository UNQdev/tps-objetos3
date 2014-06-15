package dominio;

public class RecordatorioSMS extends Recordatorio {

	@Override
	public void notificar(Notificador notificador, float horaEvento, String nombre) {
		this.hidratar(horaEvento, nombre);
		notificador.notificarViaSMS(this);		
	}

}
