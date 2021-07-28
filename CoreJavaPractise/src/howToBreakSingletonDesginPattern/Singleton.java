package howToBreakSingletonDesginPattern;

public class Singleton
{
	private static Singleton singletonObject;
	
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
		if(singletonObject == null)
		{
			synchronized(Singleton.class) 
			{
				if(singletonObject == null)
				{
					singletonObject = new Singleton();
				}
			}
		}
		return singletonObject;
	}

}
