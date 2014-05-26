package src.aspectos;

import java.util.HashMap;
import java.util.Map;

import src.validadores.Validador;

public aspect ValidadorAspect {
	
	public interface ValidacionesDeVariables {};
	
	@SuppressWarnings("rawtypes")
	private Map<String, Validador> ValidacionesDeVariables.validaciones = new HashMap<String, Validador>();

    declare parents : src.dominio..* implements ValidacionesDeVariables;
	
	public <T> void ValidacionesDeVariables.agregarValidador(String propiedad, Validador<T> validador){
		this.validaciones.put(propiedad, validador);
	}
	
	pointcut validarPropiedad(Object newValue):
		set(* src.dominio..*) 
		&& args(newValue) 
		&& !withincode(*.new(..));
	
	before(ValidacionesDeVariables m, Object newValue) : validarPropiedad(newValue) && this(m) {
		String propiedad = thisJoinPoint.getSignature().getName();
		this.buscarValidadorYValidar(m.validaciones, propiedad, newValue);
    }
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void buscarValidadorYValidar(Map<String, Validador> map, String propiedad, Object valor) {
		if(map.containsKey(propiedad)){
			map.get(propiedad).validar(valor);
		}
	}
}
