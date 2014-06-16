package dominio

class RecordatorioBloque extends Recordatorio {
	var ()=>void bloque
	
	new(String asunto, ()=>void bloque) {
		super(asunto)
		this.bloque = bloque
	}
	
	override notificar(Notificador notificador) {
		bloque.apply
	}
	
}