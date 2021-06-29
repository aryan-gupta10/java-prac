package printOneToTenUsingThreeThreads;

public class PrintNumbersSequenceMain
{

	public static void main(String[] args)
	{
		PrintNumbersSequenceRunable runnableOne = new PrintNumbersSequenceRunable(1);
		PrintNumbersSequenceRunable runnableTwo = new PrintNumbersSequenceRunable(2);
		PrintNumbersSequenceRunable runnableThree = new PrintNumbersSequenceRunable(0);
		
		Thread t1 = new Thread(runnableOne, "T1");
		Thread t2 = new Thread(runnableTwo, "T2");
		Thread t3 = new Thread(runnableThree, "T3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
