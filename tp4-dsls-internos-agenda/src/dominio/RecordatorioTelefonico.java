package dominio;

public class RecordatorioTelefonico extends Recordatorio {

	String numeroDestino;
	
	public RecordatorioTelefonico(String titulo) {
		super(titulo);
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
		notificador.notificarViaLlamada(this);		
	}
	
	@Override
	public String toString() {
		return "Llamada telefonica al: " + this.numeroDestino;
	}
}
