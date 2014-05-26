package test.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import src.dominio.Persona;
import src.exepciones.StringVacioException;
import src.validadores.ValidarStringNoVacio;

public class NombreNoVacioTest {
    
    @Test
    public void noDebePermitirNombresVacios() {
        Persona p1 = new Persona();
        p1.agregarValidador("nombre", new ValidarStringNoVacio());
        p1.setNombre("Nico");
        assertEquals("Nico", p1.getNombre()); // Se asigna el nombre correctamente
        try {
            p1.setNombre("");
            fail("Deberia haber tirado excepcion al asignarle un nombre vacio");
        } catch (StringVacioException e) {
            assertEquals("Nico", p1.getNombre()); // El nombre no cambio
        }
    }
    
    @Test
    public void noDebeLanzarExcepcion() {
        Persona p1 = new Persona();
        p1.setNombre("");
        assertEquals("", p1.getNombre());
    }
}
