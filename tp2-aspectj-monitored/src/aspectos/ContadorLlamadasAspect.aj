package aspectos;

import java.util.HashMap;

import annotations.*;

public aspect ContadorLlamadasAspect pertarget(execution((@Monitored *).new(..))) {
	
	HashMap<String, Integer> metodosCapturados =  new HashMap<String, Integer>(); 
	
	pointcut llamadasAMetodo() : 
		execution(@Monitored * *(..));
	
	after() : llamadasAMetodo() {
		String metodoActual = thisJoinPoint.getSignature().getName();
		if(!this.metodosCapturados.containsKey(metodoActual)) {
			metodosCapturados.put(metodoActual, 1);
		} else {
			this.metodosCapturados.put(metodoActual, this.metodosCapturados.get(metodoActual)+1);
		}
	}
	
	
	public int cantLlamadas(String nombreMetodo) {
		if(this.metodosCapturados.containsKey(nombreMetodo)) {
			return this.metodosCapturados.get(nombreMetodo);
		} else { return 0; }
	}
}