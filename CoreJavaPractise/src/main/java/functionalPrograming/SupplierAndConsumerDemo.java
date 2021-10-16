package functionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SupplierAndConsumerDemo
{
    public static void main(String[] args)
    {
        List<String> strList = Arrays.asList("cat", "tiger", "lion");

        consumerDemo(strList);
        supplierDemo();
    }

    private static void consumerDemo(List<String> strList)
    {
        // forEach method accepts consumer.
        strList.stream().forEach(s -> System.out.println(s));
    }

    private static void supplierDemo()
    {
        Supplier<Double> valSupplier = () -> Math.random();

        System.out.println(valSupplier.get());
    }
}
