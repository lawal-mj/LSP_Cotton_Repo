// Name: Abdulmujeeb Lawal
package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The IntegerSet class is a class use to represent a set containing intergers and has many fucntions for editing the set
 */
public class IntegerSet {

    private List<Integer> set;
    /**
     *  constructor to initialize an empty set by default
     */
    public IntegerSet() {
        set = new ArrayList<>();
    }

    /**
     * constructor that takes in the given elements and initilizes the set with them
     * @param set Arraylist of integers
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = new ArrayList<>(set);
    }

    /**
     * returns the size of the set
     * @return number of elements in the set.
     */
    public int length() {
        return set.size();
    }

    /**
     * clears the items in the set
     */
    public void clear() {
        set.clear();
    }

    /**
     * checks if an items exists in the set
     * @param value the value to look for
     * @return returns true or false
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * returns the largest element in the set
     * @return largest integer
     * @throws IntegerSetException if the set is empty.
     */
    public int largest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException(null);
        }
        return Collections.max(set);
    }



    /**
     * compares if the set is equal to another set object
     * @param o the set to be compared with
     * @return boolean -- true or false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntegerSet)) return false;
        IntegerSet that = (IntegerSet) o;
        return set.size() == that.set.size() && set.containsAll(that.set);
    }

    /**
     * Returns the smallest integer in the integer set
     * @return The smallest item in the set.
     * @throws IntegerSetException if an error occurs
     */
    public int smallest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException(null);
        }
        int min = Integer.MAX_VALUE; // Start with the largest possible integer
        for (int item : set) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }

    /**
     * adds an item to the integer set- cant have duplicates
     * @param item The integer to be added
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }


    /**
     * fucntion that removes an item from a set if its present in it an item from the set if it's present.
     * @param item integer to be removed
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * function to combine two sets(union) 
     * @param intSetb the set to combine with the current one
     */
    public void union(IntegerSet intSetb) {
        for (int i = 0; i < intSetb.set.size(); i++) {
            int item = intSetb.set.get(i);
            if (!set.contains(item)) {
                set.add(item);
            }
        }
    }


    /**
     * fucntion that intersects one set with another.
     * @param intSetb The set to be intersected with
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * function to perform a set differfence operation
     * @param intSetb The set to be subtracted.
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * function that performs with another set 
     * @param intSetb the universal set
     */
    public void complement(IntegerSet intSetb) {
        List<Integer> result = new ArrayList<>(intSetb.set);
        result.removeAll(set);
        set = result;
    }

    /**
     * function to check if the set if empty
     * @return true or false
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * returns a string representation of the integer set a string representation of the set.
     * @return custom string representation
     */
    @Override
    public String toString() {
        return set.toString();
    }
}