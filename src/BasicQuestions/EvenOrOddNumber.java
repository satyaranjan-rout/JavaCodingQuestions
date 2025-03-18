package BasicQuestions;

import java.util.Scanner;

public class EvenOrOddNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Using if-else condition

       /* if (number %2 ==0){
            System.out.println("The number is even..");
        }
        else {
            System.out.println("Number is odd..");
        }
        */


        //Using ternary operator

        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The " + number + "is " + result + " .");

        scanner.close();
    }
}

