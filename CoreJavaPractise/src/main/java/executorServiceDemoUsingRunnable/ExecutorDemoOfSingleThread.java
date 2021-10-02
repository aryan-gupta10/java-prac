package executorServiceDemoUsingRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemoOfSingleThread
{

	public static void main(String[] args)
	{
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new RunnableTaskOne());
		
		System.out.println( Thread.currentThread().getName() + " thread finished");
		
		executorService.shutdown();
	}

}
