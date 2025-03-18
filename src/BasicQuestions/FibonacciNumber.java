package BasicQuestions;

import java.util.Scanner;


public class FibonacciNumber {


    private static long[] fibonacciCache;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        fibonacciCache = new long[number + 1];


        for (int i = 0; i <= number; i++) {
            System.out.print(fibo(i) + " ");
        }

    }

    public static long fibo(int n) {

        if (n <= 1) {
            return n;
        }

        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        //Use recursion --> f(n) = f(n-1 ) + f(n-2)

        long fibonacciNumber = fibo(n - 1) + fibo(n - 2);

        fibonacciCache[n] = fibonacciNumber;

        return fibonacciNumber;
    }
}

