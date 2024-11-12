
package org.howard.edu.lsp.assignment6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {

    @Test
    @DisplayName("Test case for the largest operation")
    public void testLargest() throws IntegerSetException {
        IntegerSet set = new IntegerSet();
        assertThrows(IntegerSetException.class, set::largest);
        
        set.add(3);
        set.add(2);
        set.add(7);
        assertEquals(7, set.largest());
    }
    

    @Test
    @DisplayName("Test case for the smallest operation")
    public void testSmallest() throws IntegerSetException {
        IntegerSet set = new IntegerSet();
        assertThrows(IntegerSetException.class, set::smallest);
        
        set.add(0);
        set.add(5);
        set.add(9);
        assertEquals(0, set.smallest());
        
    }


    @Test
    @DisplayName("Test case for the equals operation")
    public void testEquals() {
        IntegerSet set1 = new IntegerSet();
        set1.add(2);
        set1.add(5);
        set1.add(7);

        IntegerSet set2 = new IntegerSet();
        set2.add(7);
        set2.add(5);
        set2.add(2);

        assertTrue(set1.equals(set2));
        assertTrue(set2.equals(set1));
    }


    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        IntegerSet set = new IntegerSet();
        assertTrue(set.isEmpty());
        set.add(2);
        set.clear();
        assertTrue(set.isEmpty());
    }


    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        IntegerSet set = new IntegerSet();
        set.add(3);
        set.add(4);
        set.add(5);
        assertEquals(3, set.length());
    }


    @Test
    @DisplayName("Test case for the contains operations")
    public void testContains() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(3);
        assertTrue(set.contains(1));
        assertTrue(set.contains(3));
        assertFalse(set.contains(2));
    }


    @Test
    @DisplayName("Test case for the add operation")
    public void testAdd() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertTrue(set.contains(1));
        assertTrue(set.contains(2));
    }


    @Test
    @DisplayName("Test case for the remove operation")
    public void testRemove() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.remove(1);
        assertFalse(set.contains(1));
    }


    @Test
    @DisplayName("Test case for the union operation")
    public void testUnion() {
        IntegerSet set1 = new IntegerSet();
        set1.add(2);
        set1.add(3);
        set1.add(4);

        IntegerSet set2 = new IntegerSet();
        set2.add(5);
        set2.add(6);
        set2.add(7);

        set2.union(set1);

        assertTrue(set2.contains(2));
        assertTrue(set2.contains(3));
        assertTrue(set2.contains(4));
        assertTrue(set2.contains(5));
        assertTrue(set2.contains(6));
        assertTrue(set2.contains(7));
        assertFalse(set2.contains(1));
    }


    @Test
    @DisplayName("Test case for the intersect operation")
    public void testIntersect() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);

        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);

        set1.intersect(set2);
        assertFalse(set1.contains(1)); 
        assertTrue(set1.contains(2));
        assertFalse(set1.contains(3));
    }


    @Test
    @DisplayName("Test case for the diff operation")
    public void testDiff() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set1.diff(set2);
        assertTrue(set1.contains(1) && !set1.contains(2));
    }


    @Test
    @DisplayName("Test case for the complement operation")
    public void testComplement() {
        IntegerSet set1 = new IntegerSet();
        set1.add(4);
        set1.add(5);
        IntegerSet set2 = new IntegerSet();
        set2.add(4);
        set2.add(6);

        set1.complement(set2);
        assertFalse(set1.contains(4));
        assertFalse(set1.contains(5));
        assertTrue(set1.contains(6));
    }



    @Test
    @DisplayName("Test case for the isempty operation")
    public void testIsEmpty() {
        IntegerSet set = new IntegerSet();
        assertTrue(set.isEmpty());
        set.add(4);
        set.add(3);
        assertFalse(set.isEmpty());
    }



    @Test
    @DisplayName("Test case for the tostring operation")
    public void testToString() {
        IntegerSet set = new IntegerSet();
        set.add(4);
        set.add(5);
        set.add(6);
        assertEquals("[4, 5, 6]", set.toString());
    }


}