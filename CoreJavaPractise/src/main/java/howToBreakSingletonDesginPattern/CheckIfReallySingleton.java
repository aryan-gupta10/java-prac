package howToBreakSingletonDesginPattern;

public class CheckIfReallySingleton
{

	public static void main(String[] args)
	{
		SingletonDemo firstSingletonObject = SingletonDemo.getInstance();
		SingletonDemo secondSingletonObject = SingletonDemo.getInstance();
		
		
		// Hashcode of both the objects should be same
		System.out.println("Hashcode of first Singleton object: " + firstSingletonObject.hashCode());
		System.out.println("Hashcode of second Singleton object: " + secondSingletonObject.hashCode());

	}

}
