package aspectos;

import annotations.*;

public aspect ContadorLlamadasAspect {
	
	int llamadas = 0;
	
	pointcut cantLlamadas() : 
		execution(@Monitored * *(..));
	
	after() : cantLlamadas() {
		this.llamadas =+ 1;
	}

}