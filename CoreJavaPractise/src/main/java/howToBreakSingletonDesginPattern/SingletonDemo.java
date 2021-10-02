package howToBreakSingletonDesginPattern;

import java.io.Serializable;

public class SingletonDemo implements Serializable, Cloneable
{

	private static final long serialVersionUID = -6342477255081451092L;
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
	
	
	// Overriding clone() method is insignificant if we are using Reflection or Serialization method to break Singleton but is required if we are using Clonable technique 
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}
