package dominio;

public class RecordatorioSMS extends Recordatorio {

	String numeroDestino;
	
	public RecordatorioSMS(String nombre) {
		super(nombre);
		this.numeroDestino = "*sin numero de destino*";
	}
	
	public String getNumeroDestino() {
		return numeroDestino;
	}

	public void setNumeroDestino(String numeroDestino) {
		this.numeroDestino = numeroDestino;
	}

	@Override
	public void notificar(Notificador notificador) {
		notificador.notificarViaSMS(this);		
	}
	
	@Override
	public String toString() {
		return "SMS al: " + this.numeroDestino;
	}

}
