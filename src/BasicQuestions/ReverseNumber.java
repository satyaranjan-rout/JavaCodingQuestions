package BasicQuestions;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number :");
        long n= scanner.nextLong();

        System.out.println(reverseNum(n));

        System.out.println("==========Using String Builder=============");

        String reversed= new StringBuilder(String.valueOf(n)).reverse().toString();

        System.out.println(reversed);
    }

    public static long reverseNum(long n ){

        long reversed = 0;

        while (n !=0){
            long lstDigit= n % 10;
            reversed= reversed * 10+ lstDigit;
            n = n/10;
        }

        return  reversed;
    }


    //using String builder


}
