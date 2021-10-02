package executorServiceDemoUsingCallable;

import java.util.concurrent.Callable;

public class CallableTaskTwo implements Callable<Integer>
{
	@Override
	public Integer call() throws Exception
	{
		Integer sumOfNumbersFromOneToFive=0;
		
		for(int i=1; i <=5; i++) 
		{
			Thread.sleep(5000);
			
			System.out.println("Callable Task Two - " +i);
			
			sumOfNumbersFromOneToFive = sumOfNumbersFromOneToFive + i;
		}
		
		return sumOfNumbersFromOneToFive;
		
	}
	
}
