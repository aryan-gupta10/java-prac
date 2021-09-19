package executorServiceDemoUsingRunnable;

public class RunnableTaskThree implements Runnable
{

	@Override
	public void run()
	{		
		try
		{
			for(int i = 1; i <=5; i++)
			{
				System.out.println("Runnable Task Three: " + i);
			}
			
			Thread.sleep(7000);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
