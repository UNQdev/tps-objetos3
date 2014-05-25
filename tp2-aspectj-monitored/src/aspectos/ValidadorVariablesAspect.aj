package aspectos;

import validadores.ValidadorStringNoVacio;
import annotations.*;
import exepciones.*;


public aspect ValidadorVariablesAspect {

	Object objeto;
	String propiedad;
	ValidadorStringNoVacio validador;
	
	pointcut setearVariable(String newValue) : 
		set(String dominio..*)
		&& args(newValue)
		&& !withincode(*.new(..)); //Excluyo al constructor del filtro
	
	before(String newValue) throws StringVacioException : setearVariable(newValue) {
		String propiedadActual = thisJoinPoint.getSignature().getName();
		if(propiedadActual.equals(this.propiedad)){		
			if (this.validador.validar(newValue)){
				throw new StringVacioException();
			}
		}
	}
	
	public void agregarValidador(Object objetoObjetivo, String nombrePropiedad, 
			ValidadorStringNoVacio validadorVariable) {
		this.validador = validadorVariable;
		this.objeto = objetoObjetivo;
		this.propiedad = nombrePropiedad;
	}

}
