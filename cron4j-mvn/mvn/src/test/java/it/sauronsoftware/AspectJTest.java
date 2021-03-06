package it.sauronsoftware;

import it.sauronsoftware.cron4j.Scheduler;

import org.junit.Test;

import java.util.Date;

public class AspectJTest {
  @Test
  public void aspectJTest() {
	// Prepares the task.
	MyTask task = new MyTask();
	// Creates the scheduler.
	Scheduler scheduler = new Scheduler();
	// Schedules the task, once every minute.
	scheduler.schedule("* * * * *", task);
	// Starts the scheduler.
	scheduler.start();
	// Stays alive for 60 seconds
	try {
		Thread.sleep(60L * 1000L);
	} catch (InterruptedException e) {
		;
	}
	// Stops the scheduler.
	scheduler.stop();
  }

  public class MyTask implements Runnable {

	public void run() {
		System.out.println("Une minute vient de passer !");
		System.out.println("Date courante : " + new Date());
	}

  }
}
