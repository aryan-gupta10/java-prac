package functionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TerminalOperationWithComparatorAsParameter
{
    public static void main(String[] args)
    {
        minTerminalOperationDemo();
        maxTerminalOperationDemo();
    }

    // min() method signature:
    // Optional<T> min(Comparator<? super T> comparator);
    private static void minTerminalOperationDemo()
    {
        List<Integer> intList = Arrays.asList(1,10,2,5,11,32,2,4);
        Optional<Integer> minNumberOptional = intList.stream().min((n1,n2) -> Integer.compare(n1,n2));
        if(minNumberOptional.isPresent())
        {
            System.out.println("Min number from list: " +minNumberOptional.get());
        }
    }

    // max() method signature
    // Optional<T> max(Comparator<? super T> comparator);
    private static void maxTerminalOperationDemo()
    {
        List<Integer> intList = Arrays.asList(1,10,2,5,11,32,2,4);
        Optional<Integer> maxNumOptional = intList.stream().max((n1,n2) -> Integer.compare(n1,n2));
        if (maxNumOptional.isPresent())
        {
            System.out.println("Max number from list: " +maxNumOptional.get());
        }
    }

}
