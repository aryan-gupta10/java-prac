package functionalPrograming;

import java.util.Arrays;
import java.util.List;

public class PrintAListOfStringsUsingStreams
{
    public static void main(String[] args) {
        List<String> stringList =  Arrays.asList("Apple", "Cat", "Banana");
       // List<String> stringList =  List.of("Apple", "Cat", "Banana");             Java 9

        print(stringList);
    }

    private static void print(List<String> stringList)
    {
        stringList.stream().forEach(element -> System.out.println("element: " +element));
    }
}
