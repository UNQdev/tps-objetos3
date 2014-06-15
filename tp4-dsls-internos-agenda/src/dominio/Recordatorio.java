package dominio;

public abstract class Recordatorio {
	
	String mensaje;
	
	public abstract void notificar(Notificador notificador);
	
	public void hidratar(double horaEvento, String nombre) {
		this.setMensaje(String.valueOf(horaEvento) + " - " + nombre); //TODO: Ver que salga bien LA string jaja
	}

	
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
