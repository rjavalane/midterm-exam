package math.problems;

import org.junit.Assert;
import org.junit.Test;

public class UnitTestingMath {


        @Test
        public void testFactorial() {
            int CurrentResult=Factorial.factorialRec(5);
            int ExpectedResult=120;
            Assert.assertEquals(CurrentResult, ExpectedResult);
            System.out.println("Test factorial using recursion PASSED");

        }
    @Test
    public void testFactorial1() {
        int CurrentResult=Factorial.factorialIter(5);
        int ExpectedResult=120;
        Assert.assertEquals(CurrentResult, ExpectedResult);
        System.out.println("Test factorial using iteration PASSED");

    }
    @Test
    public void testFibonacci() {
        int CurrentResult=Fibonacci.fibonacci(40);
        int ExpectedResult=39088169+63245986;
        Assert.assertEquals(CurrentResult, ExpectedResult);
        System.out.println("Test factorial using iteration PASSED");

   }

    }

//Apply Unit testing into each classes and methods in this package.