package howToBreakSingletonDesginPattern;

public class BreakSingletonUsingClonable
{

	public static void main(String[] args)
	{
		try
		{
			breakAndTest();
		} 
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}

	private static void breakAndTest() throws CloneNotSupportedException 
	{
		SingletonDemo originalSingletonObject = SingletonDemo.getInstance();
		
		SingletonDemo newSingletonObjectUsingCloning = (SingletonDemo) (SingletonDemo.getInstance()).clone();
		
		System.out.println("Hashcode of original singleton object: " +originalSingletonObject.hashCode());
		System.out.println("Hashcode of new singleton object created using Cloning: " +newSingletonObjectUsingCloning.hashCode());
	}
}
