package src.validadores;

import src.exepciones.StringVacioException;

public class ValidarStringNoVacio implements Validador<String> {
    public void validar (String valor) {
        if(valor.isEmpty()){
        	throw new StringVacioException();
        }
    }
}