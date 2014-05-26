package test.main;

import static org.junit.Assert.*;
import org.junit.Test;
import src.dominio.Persona;
import src.exepciones.StringVacioException;
import src.validadores.ValidarStringNoVacio;
import src.aspectos.ValidadorVariablesAspect;

public class ValidadorVariablesTests {
	
	@Test
	public void noDebePermitirNombresVacios() {
		Persona p1 = new Persona();
        ValidadorVariablesAspect.aspectOf(p1)
             .agregarValidador("nombre", new ValidarStringNoVacio());
        p1.setNombre("Nico");
        assertEquals("Nico", p1.getNombre()); // Se asigna el nombre correctamente
        try {
            p1.setNombre("");
            fail("Debera haber tirado excepcion al asignarle un nombre vacio");
        } catch (StringVacioException e) {
            assertEquals("Nico", p1.getNombre()); // El nombre no cambio
        }
    }
}