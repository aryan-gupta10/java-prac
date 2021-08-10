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
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}
