package functionalPrograming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrintSqrRootOfFirstTenPrimeNums
{
    public static void main(String[] args)
    {
        boolean isPrime = isPrime(6);
        System.out.println("Is prime: " +isPrime);

        printSqrRootOfFirstTenPrimeNums();
    }

    private static boolean isPrime(int num)
    {
        boolean isPrime = IntStream.range(2,num).noneMatch(n -> num%n==0);

        return num>1 && isPrime;
    }

    private static void printSqrRootOfFirstTenPrimeNums()
    {
        List<Double> sqrRoots = Stream.iterate(1, i -> i+1)
                                    .filter(PrintSqrRootOfFirstTenPrimeNums::isPrime).peek(System.out::println)
                                    .map(Math::sqrt).limit(10)
                                    .collect(Collectors.toList());

        System.out.println(sqrRoots);

        //[1.4142135623730951, 1.7320508075688772, 2.23606797749979, 2.6457513110645907, 3.3166247903554, 3.605551275463989, 4.123105625617661, 4.358898943540674, 4.795831523312719, 5.385164807134504]
    }
}
