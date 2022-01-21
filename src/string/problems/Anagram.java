package string.problems;


import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String word1= sc.nextLine();
        System.out.println("Enter the second String: ");
        String word2= sc.nextLine();
        if (word2.length()==word2.length()){
            char [] array1=word1.toLowerCase().toCharArray();
            char [] array2=word2.toLowerCase().toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            boolean result=Arrays.equals(array1,array2);
            if(result) {
                System.out.println(word1 + " and " + word2 + " are Anagram.");
            }
            else{
                System.out.println(word1 + " and " + word2 + " are Not Anagram.");
            }
        }

    }
}


//Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
//same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".