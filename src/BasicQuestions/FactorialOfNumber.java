package BasicQuestions;

import java.util.Scanner;

public class FactorialOfNumber {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a number :");
        int n= scanner.nextInt();

        System.out.println(factorial(n));

    }


public  static int factorial(int n){
         // Use recursion --> n * (n-1)!

    if (n<=1){
        return 1;
    }

    return n * factorial(n - 1);
    }

}
