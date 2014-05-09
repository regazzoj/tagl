package it.sauronsoftware.cron4j;

public aspect LogAspect { 
        pointcut logExecute() : execution(void execute(TaskExecutionContext));

        before() : logExecute() { 
		System.out.println("Before execution..."); 
	} 

        after() : logExecute() { 
		System.out.println("After execution..."); 
	} 
}
