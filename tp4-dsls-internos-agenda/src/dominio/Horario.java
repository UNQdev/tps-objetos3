package dominio;

public class Horario {
	
	int horas;
	int minutos;
	
	public Horario(int hora){
		this.horas = hora;
		this.minutos = 0;
	}
	
	public Horario(int cantHoras, int cantMinutos){
		// cantMinutos debe ser multiplo de 5 y estar entre 00 y 55.
		this.horas = cantHoras;
		this.minutos = cantMinutos;
	}
	
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	public static Horario masCincoMinutos(Horario horario){
		if(horario.getMinutos() == 55){
			return new Horario(horario.getHoras() + 1);
		}
		return new Horario(horario.getHoras(), horario.getMinutos() + 5);
	}

	public int minutosDeDiferenciaCon(Horario otroHorario){
		if(this.esPosteriorA(otroHorario)){
			return this.minutosDeDiferencia(otroHorario, this);
		} else {
			return this.minutosDeDiferencia(this, otroHorario);
		}
	}

	public boolean esPosteriorA(Horario otroHorario) {
		return this.getHoras() > otroHorario.getHoras() || 
				(this.getHoras() == otroHorario.getHoras() && this.getMinutos() > otroHorario.getMinutos());
	}

	private int minutosDeDiferencia(Horario hAnterior, Horario hPosterior){
		return this.horarioAMinutos(hPosterior) - this.horarioAMinutos(hAnterior);
	}
	
	private int horarioAMinutos(Horario horario){
		return horario.getHoras() * 60 + horario.getMinutos();
	}
	
	@Override
	public String toString() {
		return this.getHoras() + ":" + this.getMinutos() + " hs.";
	}
	
}
