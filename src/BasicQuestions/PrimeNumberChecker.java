package BasicQuestions;

import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = scanner.nextInt();

        // First Approach
       /* if (isPrime(number)){
            System.out.println(number +" is a Prime Number.");
        } else {
            System.out.println(number+" is not a Prime Number.");
        }*/

        //Second approach

        System.out.println( number + (isPrime(number) ? " is a Prime Number." : " is NOT a Prime Number."));

        scanner.close();
    }

    public static boolean isPrime(int number){

        // First Approach
       /* if (number <=1) return false;

        for (int i=0; i< Math.sqrt(number); i++){
            if (number % i==0){
                return true;
            }
        }

        return false;*/

        //Second approach

        if (number <=1) return false;
        if (number ==2) return true;
        if (number % 2==0) return false;

        for (int i=3; i <= Math.sqrt(number); i += 2){
            if (number % i==0) return false;
        }

        return true;

    }
}
