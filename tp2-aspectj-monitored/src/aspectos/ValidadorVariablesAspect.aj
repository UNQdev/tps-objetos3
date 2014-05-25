package aspectos;

import validadores.ValidadorStringNoVacio;
import dominio.*;
import execpciones.StringVacioException;


public aspect ValidadorVariablesAspect {

	ValidadorStringNoVacio validador; 
	
	pointcut setearVariable(Object target, String newValue) : 
		set(@Monitored * *) //Segun la documentacion, esta es la signature para advicear 
							//una property con la annotation @Monitored
		&& handler(StringVacioException) 
		&& target(target)
		&& args(newValue)
		&& !withincode(*.new(..)); //Excluyo al constructor del filtro
	
	before(Object target, String newValue) throws StringVacioException : setearVariable(target, newValue) {
		this.validador.validar(newValue); 
	}
	
	public void agregarValidador(Object target, String newValue, 
			ValidadorStringNoVacio validadorVariable) {
		this.validador = validadorVariable;
	}

}
