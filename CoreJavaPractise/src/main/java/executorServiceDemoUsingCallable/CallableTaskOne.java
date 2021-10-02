package executorServiceDemoUsingCallable;

import java.util.concurrent.Callable;

public class CallableTaskOne implements Callable<String>
{
	@Override
	public String call() throws Exception
	{
		for(int i=1; i <=5; i++) 
		{
			Thread.sleep(1000);
			
			System.out.println("Callable Task One - " +i);
		}
		
		return "******Callable Task One Finished******";
		
	}
	
}
