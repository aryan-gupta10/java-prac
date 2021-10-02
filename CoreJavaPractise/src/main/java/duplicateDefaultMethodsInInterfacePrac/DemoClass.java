package duplicateDefaultMethodsInInterfacePrac;

public class DemoClass implements InterfaceOne, InterfaceTwo
{
	@Override
	public void duplicateMethod() {
		InterfaceOne.super.duplicateMethod();
	}
	
	public static void main(String[] args)
	{
		DemoClass demo = new DemoClass();
		demo.duplicateMethod();
		
		// Output:
		// This is duplicate default method in InterfaceOne
	}
}
