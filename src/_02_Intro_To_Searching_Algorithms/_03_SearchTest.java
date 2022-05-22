package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String[] s = {"Yes", "No", "Maybe", "So"};
    	String g = "Maybe";
        assertEquals(2, _01_LinearSearch.linearSearch(s,g));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int[] l = {2,4,5,7,9,12,16,24};
    	int v = 12;
        assertEquals(5, _02_BinarySearch.binarySearch(l, 0, l.length-1, v));
    }
}
