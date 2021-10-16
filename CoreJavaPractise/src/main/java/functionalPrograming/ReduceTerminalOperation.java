package functionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceTerminalOperation {

    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(2,5,1,4,6,7);

        sumNumbersMethodOne(numList);
        sumNumbersMethodTwo(numList);
    }

    private static void sumNumbersMethodOne(List<Integer> numList)
    {
        Integer numbSum = numList.stream().reduce(0, (a,b) -> a + b);
        System.out.println("Sum using 1st way: " +numbSum);
    }

    private static void sumNumbersMethodTwo(List<Integer> numList)
    {
        Optional<Integer> numSum = numList.stream().reduce(Integer::sum);
        System.out.println("Sum using 2nd way: " +numSum.get());
    }
}
