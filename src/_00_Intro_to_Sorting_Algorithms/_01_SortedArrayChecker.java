package _00_Intro_to_Sorting_Algorithms;

import java.util.Iterator;

public class _01_SortedArrayChecker {
    /*
     * Write a static method called intArraySorted.
     *
     * This method takes in an array of integers and it returns a boolean.
     * The method returns true if the integer array is in ascending order
     * and false otherwise.
     */
    public static boolean intArraySorted(int[] arr) {
     //  Integer[] tester1 = new Integer[arr.length];
    	
			for (int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j+1]) {
					return false;
					//int keep = arr[j];
					//arr[j] = arr[j+1];
					//arr[j+1] = keep;
				}
			}
		
        return true;
    }

    /*
     * 2. Write a static method called doubleArraySorted.
     *
     * This method takes in an array of doubles and it returns a boolean.
     * The method returns true if the double array is in ascending order
     * and false otherwise.
     */
    public static boolean doubleArraySorted(double[] arr2) {
		
			for (int j = 0; j < arr2.length -1; j++) {
				if(arr2[j] > arr2[j+1]) {
					return false;
				}
			}
		
    	return true;
    	
    }

    /*
     * 3. Write a static method called charArraySorted.
     * 
     * This method takes in an array of characters and it returns a boolean.
     * The method returns true if the character array is in alphabetical
     * order and false otherwise (You can compare characters just like
     * integers).
     */
     public static boolean charArraySorted(char[] arr3) {
    	 
			for (int j = 0; j < arr3.length -1; j++) {
				if(arr3[j] > arr3[j+1]) {
					return false;
				}
			}
		
    	 return true;
     }

    /*
     * 4. Write a static method called stringArraySorted.
     *
     *  This method takes in an array of Strings and it returns a boolean.
     *  The method returns true if the String array is in alphabetical
     *  order and false otherwise (Use the compareTo(String) method).
     */
     public static boolean stringArraySorted(String[] arr4) {
    	 
			for (int j = 0; j < arr4.length -1; j++) {
				if(arr4[j].compareTo(arr4[j+1])>=0) {
					return false;
				}
			}
		
    	 return true;
     }
}
