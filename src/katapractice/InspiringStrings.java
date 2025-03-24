package katapractice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given a string of space separated words, return the longest word.
 * If there are multiple longest words, return the rightmost longest word.
 *
 * Examples
 * "red white blue"  =>  "white"
 * "red blue gold"   =>  "gold"
 */

public class InspiringStrings {


   public static void main(String[] args) {
      Scanner scanner= new Scanner(System.in);

      System.out.println("Enter the sentence : ");
      String sentence = scanner.nextLine();

      String result= longestWord(sentence);
      System.out.println("The longest word is : "+ result);
      
      scanner.close();
   }

   public static String longestWord(String wordString){
      String[] words= wordString.split(" ");
      String longestWord="";
      int longestLength=0;

      for (String word : words){

         if (word.length() > longestLength){
            longestLength= word.length();
            longestWord= word;
         }
      }

      return longestWord;

      //Using Streams

   /*   return Arrays.stream(wordString.split(" "))
              .reduce((s, s2) -> s.length() >= s2.length() ? s : s2)
              .get();*/
   }
}
