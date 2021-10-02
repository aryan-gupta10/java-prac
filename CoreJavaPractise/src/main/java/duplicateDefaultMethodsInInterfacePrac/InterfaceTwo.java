package duplicateDefaultMethodsInInterfacePrac;

public interface InterfaceTwo
{
	default void duplicateMethod() {
		System.out.println("This is duplicate default method in InterfaceTwo");
	}

}
