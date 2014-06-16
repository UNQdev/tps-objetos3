package dominio;

import org.junit.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class NotificadorTest {

	Evento mockedEvento;
	
	Recordatorio mockedRecordT;
	Recordatorio mockedRecordS;
	Recordatorio mockedRecordM;
	
	Notificador notificador;
	
	
	@Before
	public void setUp() {
		mockedEvento = mock(Evento.class);
		
		mockedRecordT = mock(RecordatorioTelefonico.class);
		mockedRecordS = mock(RecordatorioSMS.class);
		mockedRecordM = mock(RecordatorioEmail.class);
		
		notificador = new Notificador();
	}
	
	
	@Test
	public void testNotificarViaEmail() {
		notificador.notificarViaMail(mockedRecordM);
		assertTrue(notificador.getLogRecordatorios().contains(mockedRecordM));
	}
	
	@Test
	public void testNotificarViaSMS() {
		notificador.notificarViaSMS(mockedRecordS);
		assertTrue(notificador.getLogRecordatorios().contains(mockedRecordS));
	}
	
	@Test
	public void testNotificarViaLlamada() {
		notificador.notificarViaLlamada(mockedRecordT);
		assertTrue(notificador.getLogRecordatorios().contains(mockedRecordT));
	}

	@Test
	public void testSucedio() {
		//Profundizar el test y hacer que el evento dispare notificarViaALGO
		notificador.sucedio(mockedEvento);
		verify(mockedEvento, times(1)).notificarUsuario(notificador);
		
	}
}
