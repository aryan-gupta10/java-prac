package functionalPrograming;

import java.util.Arrays;
import java.util.List;

public class AnyMatch_AllMatch_NoneMatch_TerminalOperations_Demo {
    public static void main(String[] args)
    {
        List<String> cityList = Arrays.asList("Noida", "Pune", "Kapurthala");

        System.out.println("Atleast one of the city name starts with the letter 'K' - " +checkIfAnyCityNameStartesWithLetterK(cityList));
        System.out.println("All the city names start with the letter 'K' - " +checkIfAllCityNamesStartWithLetterK(cityList));
        System.out.println("Non of the city name starts with the letter 'K' - " +checkIfNonOfCityNameStartsWithLetterK(cityList));

        // Output:
        // Atleast one of the city name starts with the letter 'K' - true
        // All the city names start with the letter 'K' - false
        // Non of the city name starts with the letter 'K' - false

    }

    private static boolean checkIfAnyCityNameStartesWithLetterK(List<String> cityList)
    {
        boolean result;

        result = cityList.stream().anyMatch(city -> city.startsWith("K"));

        return result;
    }

    private static boolean checkIfAllCityNamesStartWithLetterK(List<String> cityList)
    {
        boolean result;

        result = cityList.stream().allMatch(city -> city.startsWith("K"));

        return result;
    }

    private static boolean checkIfNonOfCityNameStartsWithLetterK(List<String> cityList)
    {
        boolean result;

        result = cityList.stream().noneMatch(city -> city.startsWith("K"));

        return result;
    }
}
