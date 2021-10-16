package functionalPrograming;

import java.util.Arrays;
import java.util.List;

public class PrintSquareOfFirstTenNumbersInList
{
    public static void main(String[] args)
    {
        List<Integer> integerList = Arrays.asList(1,2,4,5,3,6,7,8,9,10,13,21);

        printSquareOfFirstTenNumbers(integerList);
    }

    private static void printSquareOfFirstTenNumbers(List<Integer> integerList)
    {
        integerList.stream().filter(num -> integerList.indexOf(num)<10).map(num -> num*num).forEach(num -> System.out.println(num));
    }
}
