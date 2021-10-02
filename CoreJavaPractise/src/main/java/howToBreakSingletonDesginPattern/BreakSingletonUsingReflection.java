package howToBreakSingletonDesginPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingletonUsingReflection
{

	public static void main(String[] args)
	{
		try
		{
			breakAndTest();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}	 
	}
	
	private static void breakAndTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		Class<?> singletonClass = Class.forName("howToBreakSingletonDesginPattern.Singleton");				//First, got hold of the Singleton class using reflection
		Constructor<SingletonDemo> singletonClassReflectionConstructor = (Constructor<SingletonDemo>) singletonClass.getDeclaredConstructor();		//After the class, now getting hold of the constructor of the Singleton class
		singletonClassReflectionConstructor.setAccessible(true);
		
		SingletonDemo newSingletonInstanceUsingReflection  = singletonClassReflectionConstructor.newInstance();
		
		System.out.println("Hashcode of original Singleton object: " + SingletonDemo.getInstance().hashCode());
		
		System.out.println("Hashcode of new Singleton object which got created using Reflection: " + newSingletonInstanceUsingReflection.hashCode());
		
	}

}
