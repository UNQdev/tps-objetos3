package dominio;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.*;

import exepciones.NoExisteEventoException;
import exepciones.YaExisteEventoException;

public class AgendaTest {

	Evento mockedEvento;	
	Horario mockedHorario;	
	Notificador mockedNotificador;
	
	ArrayList<Evento> eventos;
	
	Agenda agenda;
	
	
	
	@Before
	public void setUp() {
		mockedHorario = mock(Horario.class);
		mockedEvento = mock(Evento.class);
		mockedNotificador = mock(Notificador.class);
		
		eventos = new ArrayList<Evento>();
		eventos.add(mockedEvento);
		
		agenda = new Agenda(eventos);	
	}
	
	
	@Test
	public void testTicks() {
		when(mockedHorario.getHoras()).thenReturn(18, 19);
		when(mockedHorario.getMinutos()).thenReturn(55, 00);
		when(mockedHorario.minutosDeDiferenciaCon(mockedHorario)).thenReturn(5, 0);
		when(mockedEvento.getHorario()).thenReturn(mockedHorario);
		
		agenda.eventos.add(mockedEvento);
		agenda.tick(mockedHorario, mockedNotificador);
		agenda.tick(mockedHorario, mockedNotificador);
		
		assertEquals(agenda.eventos.size(), 2);
		verify(mockedNotificador, times(1)).sucedio(mockedEvento);
	}

	
	@Test
	public void testAgregarEventoNuevo() {
		when(mockedHorario.getHoras()).thenReturn(19);
		when(mockedHorario.getMinutos()).thenReturn(00);
		when(mockedEvento.getHorario()).thenReturn(mockedHorario);
		when(mockedEvento.getNombre()).thenReturn("Arranca el partido!");
		
		try {
			agenda.agregarEvento(mockedHorario, "Hay que dormir");
		} catch (YaExisteEventoException e) {
			
		} finally {
			assertEquals(agenda.eventos.size(), 2);
		}
	}
	
	@Test
	public void testAgregarEventoRepetido() {
		when(mockedHorario.getHoras()).thenReturn(19);
		when(mockedHorario.getMinutos()).thenReturn(00);
		when(mockedEvento.getHorario()).thenReturn(mockedHorario);
		when(mockedEvento.getNombre()).thenReturn("Arranca el partido!");
		
		try {
			agenda.agregarEvento(mockedHorario, "Arranca el partido!");
		} catch (YaExisteEventoException e) {
			assertEquals(agenda.eventos.size(), 1);
		} finally {
		}
	}	
	
	
	@Test
	public void testObtenerEventoExistente() {
		when(mockedHorario.getHoras()).thenReturn(19);
		when(mockedHorario.getMinutos()).thenReturn(00);
		when(mockedEvento.getHorario()).thenReturn(mockedHorario);
		when(mockedEvento.getNombre()).thenReturn("Arranca el partido!");
		
		Evento eventoObtenido = null;

		try {
			 eventoObtenido = agenda.obtenerEvento(mockedHorario, "Arranca el partido!");
		} catch (NoExisteEventoException e) {
			
		} finally {
			assertTrue(eventoObtenido.getNombre() == mockedEvento.getNombre());
		}
		
	}
	
	
	@Test
	public void testObtenerEventoInexistente() {
		when(mockedHorario.getHoras()).thenReturn(19);
		when(mockedHorario.getMinutos()).thenReturn(00);
		when(mockedEvento.getHorario()).thenReturn(mockedHorario);
		when(mockedEvento.getNombre()).thenReturn("Arranca el partido!");

		Evento eventoObtenido = null;
		
		try {
			eventoObtenido = agenda.obtenerEvento(mockedHorario, "Hay que dormir");
		} catch (NoExisteEventoException e) {
			assertTrue(eventoObtenido == null);
		} finally {
			
		}
	}
	

	@Test
	public void testCancelarEventoExistente() {
		when(mockedHorario.getHoras()).thenReturn(19);
		when(mockedHorario.getMinutos()).thenReturn(00);
		when(mockedEvento.getHorario()).thenReturn(mockedHorario);
		when(mockedEvento.getNombre()).thenReturn("Arranca el partido!");

		try {
			agenda.cancelarEvento(mockedHorario, "Arranca el partido!");
		} catch (NoExisteEventoException e) {
			
		} finally {
			assertEquals(agenda.eventos.size(), 0);
		}
	}
	
	@Test
	public void testCancelarEventoInexistente() {
		when(mockedHorario.getHoras()).thenReturn(19);
		when(mockedHorario.getMinutos()).thenReturn(00);
		when(mockedEvento.getHorario()).thenReturn(mockedHorario);
		when(mockedEvento.getNombre()).thenReturn("Arranca el partido!");

		try {
			agenda.cancelarEvento(mockedHorario, "Hay que dormir");
		} catch (NoExisteEventoException e) {
			assertEquals(agenda.eventos.size(), 1);
		}
	}
	
	
	
	
}
