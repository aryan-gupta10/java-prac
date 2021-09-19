package executorServiceDemoUsingRunnable;

public class RunnableTaskTwo implements Runnable
{

	@Override
	public void run()
	{		
		try
		{
			for(int i = 1; i <=5; i++)
			{
				System.out.println("Runnable Task Two: " + i);
			}
			
			Thread.sleep(5000);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
