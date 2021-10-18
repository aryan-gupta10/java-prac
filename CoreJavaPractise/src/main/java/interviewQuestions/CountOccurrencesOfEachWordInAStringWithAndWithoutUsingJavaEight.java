package interviewQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrencesOfEachWordInAStringWithAndWithoutUsingJavaEight
{

    public static void main(String[] args)
    {
        String sentence = "Code decode problem this is code decode problem";

        countOccurrencesOfEachWordUsingJavaEight(sentence);
        countOccurrencesOfEachWordWithoutUsingJavaEight(sentence);
    }

    private static void countOccurrencesOfEachWordUsingJavaEight(String sentence)
    {
        List<String> strList = Arrays.asList(sentence.toLowerCase().split(" "));

        Map<String, Long> wordCountMap = strList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(wordCountMap);
    }

    private static void countOccurrencesOfEachWordWithoutUsingJavaEight(String sentence)
    {
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : sentence.toLowerCase().split(" "))
        {
            if (wordCountMap.containsKey(word))
            {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            }
            else
            {
                wordCountMap.put(word, 1);
            }
        }
        System.out.println(wordCountMap);
    }
}
