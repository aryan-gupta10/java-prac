package functionalPrograming;

import java.util.Arrays;
import java.util.List;

public class PrintOnlyOddNumbersFromAList
{
    public static void main(String[] args)
    {
        List<Integer> integerList = Arrays.asList(3,5,4,6,2,1,9,3,5);

        printOnlyOddNumbers(integerList);
    }

    private static void printOnlyOddNumbers(List<Integer> integerList)
    {
        integerList.stream().distinct().filter(num -> num%2==1).forEach(num -> System.out.println(num));
    }
}
