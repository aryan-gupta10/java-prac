package printOneToTenUsingThreeThreads;

public class PrintNumbersSequenceRunable implements Runnable
{
	int remainder;
	int printNumbersUpto = 10;
	static int number = 1;
	static Object lock = new Object();

	public PrintNumbersSequenceRunable(int remainder)
	{
		this.remainder = remainder;
	}

	@Override
	public void run()
	{
		while (number < printNumbersUpto-1)
		{
			synchronized (lock)
			{
				while (number % 3 != remainder)
				{
					try
					{
						lock.wait();
					} 
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}

				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				lock.notifyAll();
			}
		}
	}
}
