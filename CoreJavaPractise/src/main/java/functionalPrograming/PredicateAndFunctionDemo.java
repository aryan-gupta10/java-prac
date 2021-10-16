package functionalPrograming;

import java.util.Arrays;
import java.util.List;

public class PredicateAndFunctionDemo
{
    public static void main(String[] args)
    {
        List<String> nameList = Arrays.asList("aabc", "abad", "dfgh", "abab");

        predicateDemo(nameList);
        functionDemo(nameList);
    }

    private static void predicateDemo(List<String> nameList)
    {
        System.out.println("--------------------");

        nameList.stream().filter(s -> s.startsWith("ab")).forEach(s -> System.out.println(s));
    }

    private static void functionDemo(List<String> nameList)
    {
        System.out.println("--------------------");

        nameList.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
    }
}
