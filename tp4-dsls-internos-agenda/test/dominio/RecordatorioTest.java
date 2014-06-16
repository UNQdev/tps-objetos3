package dominio;

import org.junit.*;
import static org.mockito.Mockito.*;

public class RecordatorioTest {

	Notificador mockedNotificador;
	
	Evento mockedEvento;
	
	Recordatorio recordMail;
	Recordatorio recordSMS;
	Recordatorio recordTelefonico;
	
	
	@Before
	public void setUp() {
		mockedNotificador = mock(Notificador.class);
		mockedEvento = mock(Evento.class);
		
		recordMail = new RecordatorioEmail("Arranca el partido!");
		recordSMS = new RecordatorioSMS("Arranca el partido!");
		recordTelefonico = new RecordatorioTelefonico("Arranca el partido!");
	}
	
	
	@Test
	public void testNotificar() {
		recordMail.notificar(mockedNotificador);
		recordSMS.notificar(mockedNotificador);
		recordTelefonico.notificar(mockedNotificador);
		verify(mockedNotificador, times(1)).notificarViaMail(recordMail);
		verify(mockedNotificador, times(1)).notificarViaSMS(recordSMS);
		verify(mockedNotificador, times(1)).notificarViaLlamada(recordTelefonico);
	}

}
