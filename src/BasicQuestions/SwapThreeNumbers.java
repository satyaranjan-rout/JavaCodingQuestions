package BasicQuestions;

import java.util.Scanner;

public class SwapThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner1= new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = scanner1.nextInt();

        Scanner scanner2= new Scanner(System.in);
        System.out.println("Enter Second Number : ");
        int b = scanner2.nextInt();

        Scanner scanner3= new Scanner(System.in);
        System.out.println("Enter Third Number : ");
        int c = scanner2.nextInt();

        swapNumbers(a,b,c);
    }

    public static void swapNumbers(int a, int b, int c){

        a= a^b^c;
        b=a^b^c;
        c=a^b^c;
        a=a^b^c;

        System.out.println("After Swapping first value is : "+ a+" second value is: "+b+" third value is: "+c);


    }
}
