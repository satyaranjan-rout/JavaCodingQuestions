package BasicQuestions;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int number = sc.nextInt();

        isArmstrong(number);
        System.out.println("Is " + number + " an Armstrong number ? " + ((isArmstrong(number)) ? "True" : "False"));

    }

    public static boolean isArmstrong(int n) {

        int originalNumber = n;

        int numOfDigits = String.valueOf(n).length();

        int sum = 0;

        while (n != 0) {
            int lastDigit = n % 10; // Find last digit

            sum += Math.pow(lastDigit, numOfDigits);

            n = n / 10; // This will remove last digit

        }

        return sum == originalNumber;


    }
}
