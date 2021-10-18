package interviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElementsInAGivenIntListUsingStreams
{
    public static void main(String[] args)
    {
        List<Integer> intList = Arrays.asList(1,4,2,6,1,10,4,7,10,10);

        findDuplicate(intList);
    }

    private static void findDuplicate(List<Integer> intList)
    {
        Set<Integer> uniqueNumSet = new HashSet<Integer>();

        intList.stream().filter(n -> !uniqueNumSet.add(n)).distinct().forEach(System.out::println);
    }
}
