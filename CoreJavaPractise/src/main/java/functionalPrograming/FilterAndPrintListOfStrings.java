package functionalPrograming;

import java.util.Arrays;
import java.util.List;

public class FilterAndPrintListOfStrings {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("cat", "ball", "bat", "rat", "snow");

        filterAndPrint(stringList);
    }

    //Print only those strings which ends with 'at'
    private static void filterAndPrint(List<String> stringList)
    {
        stringList.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println("element - " + element));
    }
}
