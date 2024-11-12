package org.howard.edu.lsp.assignment6;

/**
 * Driver class to test IntegerSet functionality.
 */
public class Driver {
    public Driver() {
        // Empty constructor
    }

    /**
     * Main method to demonstrate IntegerSet operations.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        IntegerSet set3 = new IntegerSet(); // Empty set

        // Display initial sets
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());

        // Check length and equality
        System.out.println("The length of set1: " + set1.length());
        System.out.println("Does set1 equal set2: " + set1.equals(set2));

        // Remove element, difference, and union
        set2.remove(3);
        System.out.println("Value of set2 after removing 3 is: " + set2.toString());
        set2.diff(set1);
        System.out.println("The Value of set2 after finding the difference from set1: " + set2.toString());
        System.out.println("Does set1 contain 2: " + set1.contains(2));
        set2.union(set1);
        System.out.println("The Value of set2 after Union with set1: " + set2.toString());

        // Smallest and largest values with exception handling
        try {
            System.out.println("Smallest value in Set1 is: " + set1.smallest());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Largest value in Set1 is: " + set1.largest());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Intersection, clearing, and checking emptiness
        set1.intersect(set2);
        System.out.println("The Value of set1 after intersecting with set2: " + set1.toString());
        set1.clear();
        System.out.println("Is set1 empty after calling clear: " + set1.isEmpty());

        // Complement operation
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.complement(set2);
        System.out.println("Complement of Set1 relative to Set2: " + set1);

        // Test largest and smallest methods on an empty set (set3)
        try {
            System.out.println("Attempting to get largest on empty Set3: " + set3.largest());
        } catch (IntegerSetException e) {
            System.out.println("Correctly caught exception for largest on empty set: " + e.getMessage());
        }
        try {
            System.out.println("Attempting to get smallest on empty Set3: " + set3.smallest());
        } catch (IntegerSetException e) {
            System.out.println("Correctly caught exception for smallest on empty set: " + e.getMessage());
        }

        // Test equals method with a non-IntegerSet object
        System.out.println("Set1 equals a String object: " + set1.equals("Hello"));
    }
}
