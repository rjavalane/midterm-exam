package math.problems;

import com.mysql.cj.conf.PropertyDefinitions;

import java.util.Scanner;

public class Factorial {
    //below is finding the factorial of a given number using the recursion methode

    static int factorialRec(int n) {
        if (n <= 0)
            return 1;
        else return n * factorialRec(n - 1);
    }
    // below is finding the factorial of a given number using the iteration methode
    static int factorialIter(int m){
        int fac = 1;
        for (int i = 1; i <= m; i++) {
            fac = fac * i;
        }
        return fac;

    }
    public static void main(String[] args) {
        int numRec;
        int resultRec;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number you want a factorial of, using Recursion methode");
        numRec = sc.nextInt();
        resultRec = factorialRec(numRec);
        System.out.println(numRec+"! = "+resultRec);
        System.out.println("\nIterarion methode");

        int numIter;
        int resultIter;

        System.out.println("Enter a positive number you want a factorial of, using Iteration methode");
        numIter = sc.nextInt();
        resultIter = factorialRec(numIter);
        System.out.println(numIter+"! = "+resultIter);



        }
    }
/*
 * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
 * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
 *
 */
