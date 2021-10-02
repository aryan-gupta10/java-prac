package duplicateDefaultMethodsInInterfacePrac;

public interface InterfaceOne
{
	default void duplicateMethod() {
		System.out.println("This is duplicate default method in InterfaceOne");
	}

}
