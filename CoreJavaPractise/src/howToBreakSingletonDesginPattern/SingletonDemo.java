package howToBreakSingletonDesginPattern;

import java.io.Serializable;

public class SingletonDemo implements Serializable
{
	private static SingletonDemo singletonObject;
	
	private SingletonDemo()
	{
		
	}
	
	public static SingletonDemo getInstance()
	{
		if(singletonObject == null)
		{
			synchronized(SingletonDemo.class) 
			{
				if(singletonObject == null)
				{
					singletonObject = new SingletonDemo();
				}
			}
		}
		return singletonObject;
	}

}
