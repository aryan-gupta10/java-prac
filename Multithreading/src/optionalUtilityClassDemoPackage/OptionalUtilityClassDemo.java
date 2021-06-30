package optionalUtilityClassDemoPackage;

import java.util.Optional;

public class OptionalUtilityClassDemo
{

	public static void main(String[] args)
	{
	//	withoutUsingOptional();
		
		withOptional();
	}
	
	private static void withoutUsingOptional() 
	{
		String[] words = new String[10];
		String name = words[5].toLowerCase();		//This will throw a NullPointerException
		
		System.out.println("Name: " +name);
	}
	
	private static void withOptional()
	{
		String[] words = new String[10];
		Optional<String> name = Optional.ofNullable(words[5]);		// If the argument passed to Optional.ofNullable() is non-null, then it returns an Optional containing the specified value, otherwise it returns an empty Optional.
		
		System.out.println("Name: " + name.orElse("No value found").toLowerCase()); // orElse() is great when you want to return a default value if the Optional is empty
	}

}
