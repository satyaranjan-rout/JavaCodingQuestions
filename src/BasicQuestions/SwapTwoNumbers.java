package BasicQuestions;

import java.util.Scanner;

/**
 * Swap two numbers without using third variable
 */

public class SwapTwoNumbers {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter Second Number : ");
        int b = scanner2.nextInt();

        swapNumber(a, b);


    }

    public static void swapNumber(int a, int b) {

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swapping the First Value :" + a + " and Second value : " + b);

    }
}
