package _00_Intro_to_Sorting_Algorithms;

class _02_SwappingDigits {

    // 1. Complete the method so that the first two elements of the array are
    //    swapped.
    public static void swapArrayOfTwo(int[] arr) {

	int plchlder = 0;
	plchlder = arr[1];
	arr[1] = arr[0];
    arr[0] = plchlder;
    }

    // 2. Complete the method so that it sorts the array using a bubble sort.
    //    Iterate through the array and when you find two elements that are out
    //    of order, swap them. Repeat this until the array is in order.
    public static void sortIntArray(int[] arr) {
 for (int i = 0; i < arr.length; i++) {
	for (int j = 0; j < arr.length -1; j++) {
		int temp = 0;
		if(arr[j] > arr[j+1]) {
			temp = arr[j+1];
			arr[j+1] = arr[j];
			arr[j] = temp;
		}
	}
}
 
    }

    // 3. Complete the method so that it finds the median of the array.
    //    *Hint* it helps to sort it first.
    //    *Double Hint* Use the method you already wrote in step 2 to sort it
    public static int findMiddle(int[] arr) {
    	sortIntArray(arr);
    	 int middle = 0;
    	 if(arr.length%2==0) {
    		 System.out.println("Even");
    	 }
    	 else {
    		 System.out.println("Odd");
    		 

    	 }
    	return arr[arr.length/2];
    }
}
