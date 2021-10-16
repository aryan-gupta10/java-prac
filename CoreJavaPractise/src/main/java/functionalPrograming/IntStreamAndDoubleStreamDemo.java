package functionalPrograming;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class IntStreamAndDoubleStreamDemo
{
    public static void main(String[] args)
    {
        intStreamDemo();
        doubleStreamDemo();
    }

    private static void intStreamDemo()
    {
        IntStream intStreamOne = IntStream.range(1,11);
        intStreamOne.map(n -> n*n).forEach(System.out::println);
    }

    private static void doubleStreamDemo()
    {
        //--------------------------------------------------------------------------------------------
        DoubleStream doubleStreamOne = DoubleStream.of(1.1, 2.1, 3.2, 4.3);
        OptionalDouble optionalDouble = doubleStreamOne.average();
        if (optionalDouble.isPresent())
        {
            System.out.println("Average of numbers in double stream: " + optionalDouble.getAsDouble());
        }
    }
}
