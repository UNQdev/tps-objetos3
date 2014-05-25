package validadores;

import execpciones.StringVacioException;


public class ValidadorStringNoVacio {

	public void validar(String string) throws StringVacioException {
		if (string.isEmpty()) {
			throw new StringVacioException();
		}
	}


}
