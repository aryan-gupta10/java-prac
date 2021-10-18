package interviewQuestions;

public class FindNthNumberInFibonacciSeries
{
    // Fibonacci series 0 1 1 2 3 5 8 13 21 34 55
    // If you look at the series then you know that the nth term in the Fibonacci sequence is equal to some of the previous two Fibonacci numbers.

    public static void main(String[] args)
    {
        int num = fib(8);
        System.out.println(num);
    }

    private static int fib(int n)
    {
        if (n < 1)
        {
            return n;
        }
        else if (n == 1)
        {
            return 0;
        }
        else if (n == 2)
        {
            return 1;
        }
        else
        {
            return fib(n-1) + fib(n-2);
        }
    }

}
