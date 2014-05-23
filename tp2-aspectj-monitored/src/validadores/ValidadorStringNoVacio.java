package validadores;

import execpciones.StringVacioException;


public class ValidadorStringNoVacio extends ValidadorVariables {

	@Override
	public void validar(Object propertyValue) {
		this.validar(propertyValue);	
	}
	
	public void validar(String string) throws StringVacioException {
		if (string.isEmpty()) {
			throw new StringVacioException();
		}
	}


}
