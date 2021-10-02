package executorServiceDemoUsingCallable;

import java.util.concurrent.Callable;

public class CallableTaskThree implements Callable<Integer>
{
	@Override
	public Integer call() throws Exception
	{
		Integer sumOfNumbersFromFiveToTen=0;
		
		for(int i=5; i <=10; i++) 
		{
			Thread.sleep(7000);
			
			System.out.println("Callable Task Three - " +i);
			
			sumOfNumbersFromFiveToTen = sumOfNumbersFromFiveToTen + i;
		}
		
		return sumOfNumbersFromFiveToTen;
		
	}
	
}
