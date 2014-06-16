package dominio;

public class RecordatorioEmail extends Recordatorio {

	String remitente;
	String asunto;
	
	public RecordatorioEmail(String nombre) {
		super(nombre);
		this.remitente = "*sin remitente*";
		this.asunto = "*sin asunto*";
	}
	
	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	@Override
	public void notificar(Notificador notificador) {
		notificador.notificarViaMail(this);
	}
	
	@Override
	public String toString() {
		return "Email para: " + this.remitente + " con asunto: '" + this.asunto + "'";
	}
}
