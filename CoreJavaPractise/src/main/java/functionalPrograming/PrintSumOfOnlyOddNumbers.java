package functionalPrograming;

import java.util.Arrays;
import java.util.List;

public class PrintSumOfOnlyOddNumbers
{
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,5,6,5);

        printSum(integerList);

        printSumOfOnlyOddNums(integerList);
    }

    private static void printSum(List<Integer> integerList)
    {
        Integer sum = integerList.stream().reduce(0,(num1,num2) -> (num1+num2));
        System.out.println("Sum: " +sum);
    }

    private static void printSumOfOnlyOddNums(List<Integer> integerList)
    {
        Integer sumOfOddNums = integerList.stream().filter(num -> num%2==1).reduce(0,(num1,num2) -> (num1+num2));
        System.out.println("Sum of odd numbers: " +sumOfOddNums);
    }
}
