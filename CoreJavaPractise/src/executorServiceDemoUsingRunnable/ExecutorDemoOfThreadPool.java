package executorServiceDemoUsingRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemoOfThreadPool
{

	public static void main(String[] args)
	{
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new RunnableTaskOne());
		executorService.execute(new RunnableTaskTwo());
		executorService.execute(new RunnableTaskThree());
		
		System.out.println( Thread.currentThread().getName() + " thread finished");
		
		executorService.shutdown();
	}

}
