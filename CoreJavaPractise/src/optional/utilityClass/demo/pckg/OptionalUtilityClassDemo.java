package optional.utilityClass.demo.pckg;

import java.util.Optional;



public class OptionalUtilityClassDemo
{
	static String[] words = new String[10];
	

	public static void main(String[] args)
	{
		withoutUsingOptional();

		withOptionalUtilityClass();
	}

	private static void withoutUsingOptional() 
	{
		if(words[5] != null) 
		{
			String name = words[5].toLowerCase();		// This will throw a NullPointerException if there was no null check
			System.out.println("Name: " +name);
		}
	}
	
	private static void withOptionalUtilityClass() 
	{		
		Optional<String> name = Optional.ofNullable(words[5]); 					// If the argument passed to Optional.ofNullable() is non-null, then it returns an Optional containing the specified value, otherwise it returns an empty Optional.
		System.out.println("Name: " +name.orElse("No value").toLowerCase());	// orElse() is great when you want to return a default value if the Optional is empty. 
	}
}
