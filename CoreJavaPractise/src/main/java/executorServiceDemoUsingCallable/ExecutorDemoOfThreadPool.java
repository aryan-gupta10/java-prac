package executorServiceDemoUsingCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemoOfThreadPool
{

	public static void main(String[] args)
	{
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Future<String> futureOne = executorService.submit(new CallableTaskOne());
		Future<Integer> futureTwo = executorService.submit(new CallableTaskTwo());
		
		try
		{
			String taskOutput = futureOne.get();			
			System.out.println(taskOutput);
			
			Integer sumOfNumberFromOneToFive = futureTwo.get();
			System.out.println("Sum of numbers from One to Five: " +sumOfNumberFromOneToFive);
			
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
