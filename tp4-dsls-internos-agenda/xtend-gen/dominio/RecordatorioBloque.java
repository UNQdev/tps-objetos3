package dominio;

import dominio.Notificador;
import dominio.Recordatorio;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure0;

@SuppressWarnings("all")
public class RecordatorioBloque extends Recordatorio {
  private Procedure0 bloque;
  
  public RecordatorioBloque(final String asunto, final Procedure0 bloque) {
    super(asunto);
    this.bloque = bloque;
  }
  
  public void notificar(final Notificador notificador) {
    this.bloque.apply();
  }
}
