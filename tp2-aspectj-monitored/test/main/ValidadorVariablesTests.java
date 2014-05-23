package main;

import static org.junit.Assert.*;

import org.junit.Test;

import validadores.ValidadorStringNoVacio;
import dominio.Persona;
import execpciones.StringVacioException;
import aspectos.ValidadorVariablesAspect;

public class ValidadorVariablesTests {
	
	
	@Test
	public void noDebePermitirNombresVacios() {
		Persona p1 = new Persona();
	        ValidadorVariablesAspect.aspectOf()
	             .agregarValidador(p1, "nombre", new ValidadorStringNoVacio());
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