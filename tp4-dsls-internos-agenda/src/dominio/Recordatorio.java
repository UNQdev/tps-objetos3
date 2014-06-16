package dominio;

public abstract class Recordatorio {
	
	String titulo;
	
	public Recordatorio(String titulo){
		this.titulo = titulo;
	}
	
	public abstract void notificar(Notificador notificador);
	
	public void hidratar(Horario horaEvento, String titulo) {
		this.setTitulo(horaEvento.toString() + "  " + titulo);
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String mensaje) {
		this.titulo = mensaje;
	}
	
	@Override
	public String toString() {
		return "Recordar";
	}
	
}
