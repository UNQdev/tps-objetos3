package src.aspectos;

import java.util.HashMap;
import java.util.Map;
import src.validadores.Validador;
import src.annotations.*;

public aspect ValidadorVariablesAspect pertarget(execution((@Monitored *).new(..))){
	
	@SuppressWarnings("rawtypes")
	private Map<String, Validador> validaciones = new HashMap<String, Validador>();
	
	pointcut setearVariable(String newValue) : 
		set(* src.dominio..*)
		&& args(newValue)
		&& !withincode(*.new(..));
	
	before(Object newValue) : setearVariable(newValue) {
		String propiedad = thisJoinPoint.getSignature().getName();
		this.buscarValidadorYValidar(propiedad, newValue);
    }
	
	@SuppressWarnings("unchecked")
	private void buscarValidadorYValidar(String propiedad, Object newValue) {
		if(this.validaciones.containsKey(propiedad)){
			this.validaciones.get(propiedad).validar(newValue);
		}		
	}

	@SuppressWarnings("rawtypes")
	public void agregarValidador(String nombrePropiedad, Validador validadorVariable) {
		this.validaciones.put(nombrePropiedad, validadorVariable);
	}

}
