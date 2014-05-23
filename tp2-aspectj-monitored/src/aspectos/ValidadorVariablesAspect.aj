package aspectos;

import validadores.ValidadorVariables;
import validadores.ValidadorStringNoVacio;
import dominio.Persona;
import execpciones.ValorInvalidoException;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public aspect ValidadorVariablesAspect {

	ValidadorVariables validador; 
	
	pointcut setearVariable(Object target, Object newValue) : 
		set(@Monitored * *) //Segun la documentacion, esta es la signature para advicear 
							//una property con la annotation @Monitored		
		&& target(target)
		&& args(newValue)
		&& !withincode(*.new(..)); //Excluyo al constructor del filtro
	
	before(Object target, Object newValue) : setearVariable(target, newValue) {
		this.validador.validar(newValue);
		proceed(target, newValue); //TODO: QUE CARAJO!?
	}
	
	public void agregarValidador(Object target, String newValue, 
			ValidadorVariables validadorVariable) {
		this.validador = validadorVariable;
	}

}
