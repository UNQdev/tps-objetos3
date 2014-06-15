package dominio;

public class RecordatorioSMS extends Recordatorio {

	public RecordatorioSMS(double horaEvento, String nombre) {
		this.hidratar(horaEvento, nombre);
	}
	
	@Override
	public void notificar(Notificador notificador) {
		notificador.notificarViaSMS(this);		
	}

}
