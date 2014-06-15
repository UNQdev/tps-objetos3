package dominio;

public abstract class Recordatorio {
	
	String mensaje;
	
	public abstract void notificar(Notificador notificador, String nombre);	

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	
}
