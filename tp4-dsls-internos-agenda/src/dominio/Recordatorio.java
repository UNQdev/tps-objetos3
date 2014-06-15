package dominio;

public abstract class Recordatorio {
	
	String mensaje;
	
	public abstract void notificar(Notificador notificador, float horaEvento, String nombre);
	
	public void hidratar(float horaEvento, String nombre) {
		this.setMensaje(String.valueOf(horaEvento) + " - " + nombre); //TODO: Ver que salga bien LA string jaja
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	
}
