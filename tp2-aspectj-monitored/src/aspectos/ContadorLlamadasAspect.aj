package src.aspectos;

import java.util.HashMap;
import src.annotations.*;

public aspect ContadorLlamadasAspect pertarget(execution((@Monitored *).new(..))) {
	
	HashMap<String, Integer> metodosCapturados =  new HashMap<String, Integer>(); 
	
	pointcut llamadasAMetodo() : 
		execution(@Monitored * *(..));
	
	after() : llamadasAMetodo() {
		String metodoActual = thisJoinPoint.getSignature().getName();
		if(!esMetodoMonitoreado(metodoActual)) {
			metodosCapturados.put(metodoActual, 1);
		} else {
			this.metodosCapturados.put(metodoActual, this.metodosCapturados.get(metodoActual)+1);
		}
	}

	private boolean esMetodoMonitoreado(String metodoActual) {
		return this.metodosCapturados.containsKey(metodoActual);
	}
	
	public int cantLlamadas(String nombreMetodo) {
		if(esMetodoMonitoreado(nombreMetodo)) {
			return this.metodosCapturados.get(nombreMetodo);
		} else { return 0; }
	}
}