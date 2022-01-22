package math.problems;

import org.junit.Assert;
import org.junit.Test;

import java.awt.peer.SystemTrayPeer;
import java.util.ArrayList;
import java.util.Arrays;

public class UnitTestingMath {


    @Test
    public void testfactorial(){
        int currentResult=Factorial.factorialRec(5);
        int ExpectedResult=120;
        Assert.assertEquals(currentResult,ExpectedResult);
        System.out.println(" passed ");
    }
    @Test
    public void testfactorial1(){
        int currentResult=Factorial.factorialIter(5);
        int ExpectedResult=120;
        Assert.assertEquals(currentResult,ExpectedResult);
        System.out.println(" passed ");
    }
    @Test
    public void testFibonacci(){
        int currentResult=Fibonacci.fibonacci(40);
        int ExpectedResult=63245986+39088169;
        Assert.assertEquals(currentResult,ExpectedResult);
        System.out.println(" passed");
    }
    @Test
    public void testFindLowestDifference(){
        int [] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int [] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        int currentResult=FindLowestDifference.lowestDifference(array1,array2);
        int ExpectedResult=1;
        Assert.assertEquals(currentResult,ExpectedResult);
        System.out.println(" passed");
    }
    @Test
    public void testMissingNumber(){
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int currentResult=FindMissingNumber.missingNumber(array);
        int ExpectedResult=9;
        Assert.assertEquals(currentResult,ExpectedResult);
        System.out.println(" passed");
    }
    @Test
    public void testLowestNumber(){
        int array[] = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
        int currentResult=LowestNumber.lowestNumber(array);
        int ExpectedResult=5;
        Assert.assertEquals(currentResult,ExpectedResult);
        System.out.println(" passed");
    }
    @Test
    public void testpattern(){

        ArrayList <Integer> ExpectedResult=PrimeNumber.findPrimes(2,1000);
        ArrayList<Integer> currentResult= new ArrayList<>();
        for (int i=2;i<=1000;i++){
            currentResult.add(i);
        }
        Assert.assertEquals(currentResult,ExpectedResult);
        System.out.println(" passed");
    }
}

//Apply Unit testing into each classes and methods in this package.