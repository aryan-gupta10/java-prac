package executorServiceDemoUsingRunnable;

public class RunnableTaskOne implements Runnable
{

	@Override
	public void run()
	{		
		try
		{
			for(int i = 1; i <=5; i++)
			{
				System.out.println("Runnable Task One: " + i);
				
				Thread.sleep(1000);
			}
			
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
