package dominio;

import org.junit.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;


public class EventoTest {

	Notificador mockedNotificador;
	
	Horario mockedHorario;
	
	Recordatorio mockedRecordT;
	Recordatorio mockedRecordS;
	Recordatorio mockedRecordM;
	ArrayList<Recordatorio> recordatorios;
	
	Evento evento;
	
	
	@Before
	public void setUp(){
		mockedNotificador = mock(Notificador.class);
		
		mockedHorario = mock(Horario.class);
		
		mockedRecordT = mock(RecordatorioTelefonico.class);
		mockedRecordS = mock(RecordatorioSMS.class);
		mockedRecordM = mock(RecordatorioEmail.class);
		
		recordatorios = new ArrayList<Recordatorio>();
		recordatorios.add(mockedRecordM);
		recordatorios.add(mockedRecordS);
		recordatorios.add(mockedRecordT);
		
		evento = new Evento(mockedHorario, "Arranca el partido!");
		evento.setRecordatorios(recordatorios);
	}
	
	
	@Test
	public void testNotificarUsuario() {
		evento.notificarUsuario(mockedNotificador);
		verify(mockedRecordM, times(1)).notificar(mockedNotificador);
		verify(mockedRecordS, times(1)).notificar(mockedNotificador);
		verify(mockedRecordT, times(1)).notificar(mockedNotificador);
	}

}
