package it.sauronsoftware.cron4j;

public aspect LogAspect { 
        pointcut logExecute() : execution(void execute(TaskExecutionContext));

        before() : logExecute() { 
		System.out.println("Avant l'exécution..."); 
	} 

        after() : logExecute() { 
		System.out.println("Après l'exécution..."); 
	} 
}
