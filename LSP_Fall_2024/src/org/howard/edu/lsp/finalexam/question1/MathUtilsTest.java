package org.howard.edu.lsp.finalexam.question1;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {
    


    // Tests for factorial(int n)
    @Test
    @DisplayName("Test for factorial of zero")
    public void testFactorialOfZero() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(1, mathUtils.factorial(0), "Factorial of zero should be 1");
    }

    @Test
    @DisplayName("Test for factorial of a positive number")
    public void testFactorialOfPositiveNumber() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(120, mathUtils.factorial(5), "Factorial of 5 should be 120");
    }

    @Test
    @DisplayName("Test for factorial of a negative number throws exception")
    public void testFactorialOfNegativeThrowsException() {
        MathUtils mathUtils = new MathUtils();
        assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.factorial(-1);
        }, "Factorial of negative number should throw IllegalArgumentException");
    }
    




    // Tests for isPrime(int n)
    @Test
    @DisplayName("Test for isPrime with a prime number")
    public void testIsPrimeWithPrimeNumber() {
        MathUtils mathUtils = new MathUtils();
        assertTrue(mathUtils.isPrime(7), "7 should be a prime number");
    }

    @Test
    @DisplayName("Test for isPrime with number less or equal to 1")
    public void testIsPrimeWithOne() {
        MathUtils mathUtils = new MathUtils();
        assertFalse(mathUtils.isPrime(1), "1 is not a prime number");
    }

    @Test
    @DisplayName("Test for isPrime with a non-prime number")
    public void testIsPrimeWithNonPrimeNumber() {
        MathUtils mathUtils = new MathUtils();
        assertFalse(mathUtils.isPrime(9), "9 should not be a prime number");
    }








    // Tests for gcd(int a, int b)
    @Test
    @DisplayName("Test for gcd of two positive numbers")
    public void testGcdOfPositiveNumbers() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(6, mathUtils.gcd(48, 18), "GCD of 48 and 18 should be 6");
    }

    @Test
    @DisplayName("Test for gcd when one number is zero")
    public void testGcdOneNumberZero() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(5, mathUtils.gcd(0, 5), "GCD of 0 and 5 should be 5");
    }

    @Test
    @DisplayName("Test for gcd of both numbers zero throws exception")
    public void testGcdBothZeroThrowsException() {
        MathUtils mathUtils = new MathUtils();
        assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.gcd(0, 0);
        }, "GCD of (0,0) should throw IllegalArgumentException");
    }

}
