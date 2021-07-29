package howToBreakSingletonDesginPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BreakSingletonUsingSerialization
{

	public static void main(String[] args)
	{
		try
		{
			breakAndVerify();
		} 
		catch (ClassNotFoundException | IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	// In this, we have serialized the original Singleton class object to a file and then read it from that file to create a new object, this is how we broke Singleton design pattern
	
	private static void breakAndVerify() throws FileNotFoundException, IOException, ClassNotFoundException 
	{
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("E:\\eclipse-workspace\\FileForSerializedObjects.ser"));
		SingletonDemo originalSingletonObject = SingletonDemo.getInstance();
		objectOutputStream.writeObject(originalSingletonObject);
		objectOutputStream.close();
		
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("E:\\eclipse-workspace\\FileForSerializedObjects.ser"));
		SingletonDemo newSingletonObjectUsingSerialization = (SingletonDemo) objectInputStream.readObject();
		objectInputStream.close();
		
		System.out.println("Hashcode of original singleton object: " +originalSingletonObject.hashCode());
		System.out.println("Hashcode of new singleton object created using serialization: " +newSingletonObjectUsingSerialization.hashCode());
	}

}
