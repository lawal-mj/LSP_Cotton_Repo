/**
*  Name: Abdulmujeeb Lawal
*/
package org.howard.edu.lsp.midterm.question2;
/**
 * This class shows the usege of the calulator class with different types of inputs.
 */
public class CalculatorDriver {
    public static void main(String[] args) {
        // two integers
        System.out.println(Calculator.sum(5, 10)); 

        // two doubles
        System.out.println(Calculator.sum(3.5, 7.8)); 

        // an array 
        System.out.println(Calculator.sum(new int[]{1, 2, 3, 4, 5})); 
    }
}
