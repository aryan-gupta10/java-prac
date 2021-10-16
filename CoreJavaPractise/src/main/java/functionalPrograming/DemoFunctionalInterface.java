package functionalPrograming;

@FunctionalInterface
public interface DemoFunctionalInterface
{
    void abstractMethod();

    default void demoDefaultMethod()
    {
        System.out.println("Demo default method in a functional interface");
    }

    static void demoStaticMethod()
    {
        System.out.println("Demo static method in a functional interface");
    }

}
