package executorServiceDemoUsingCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemoOfSingleThread
{

	public static void main(String[] args)
	{
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future<String> future = executorService.submit(new CallableTaskOne());
		
		try
		{
			String taskOutput = future.get();
			
			System.out.println(taskOutput);
			
			System.out.println("-------Main thread has finished-------");
		} 
		catch (InterruptedException | ExecutionException e)
		{
			e.printStackTrace();
		}
		
		finally 
		{
			executorService.shutdown();
		}

	}

}
