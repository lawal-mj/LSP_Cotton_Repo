/**
*  Name: Abdulmujeeb Lawal
*/
package org.howard.edu.lsp.midterm.question2;

/**
 * The Calculator class has methods to add two integers, two doubles or an array of integers
 */
public class Calculator {

    /**
     * adds two integers
     *
     * @param a first integer
     * @param b second integer
     * @return sum of both
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * adds two doubles
     *
     * @param a first double
     * @param b second double
     * @return sum of both
     */
    public static double sum(double a, double b) {
        return a + b;
    }

    /**
     * adds all items in an integer array
     *
     * @param numbers integer array
     * @return sum of all numbers in the array
     */
    public static int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
