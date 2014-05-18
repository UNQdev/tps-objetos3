package aspectos;

import annotations.*;

public aspect ContadorLlamadasAspect {
	
	int llamadas = 0;
	
	pointcut cantLlamadas(Object target, Object value) : 
		execution(* (@Monitored *).*(*))
		&& target(target)
		&& args(value);
	
	after(Object target, Object value) : cantLlamadas(target, value) {
		this.llamadas =+ 1;
	}

}