package com.java.problemsolving;

//4.Implement a function that merges two sorted arrays into a single sorted array.

public class MergedArray {
	 public static void main(String[] args) {
		 int[] arr1 = {1, 4, 5, 6, 4};
	     int[] arr2 = {2, 5, 8,12, 3, 4};
	     
//	      // Step 1: Merge the two arrays
	        int[] mergedArray = new int[arr1.length + arr2.length];
	        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
	        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);

	        // Step 2: Sort the merged array
	        sortArray(mergedArray);

	        // Step 3: Print the sorted merged array
	        System.out.print("Sorted merged array: ");
	        for (int num : mergedArray) {
	            System.out.print(num + " ");
	        }
	 }
		    // Method to sort an array using Bubble Sort
		    public static void sortArray(int[] arr) {
		        int temp;
		       // System.out.print("Sorted merged array:-");
		        for (int i = 0; i < arr.length; i++) {
		            for (int j = i + 1; j < arr.length; j++) {
		                if (arr[i] > arr[j]) {
		                    temp = arr[i];
		                    arr[i] = arr[j];
		                    arr[j] = temp;
		                }
		            }
		            
		          //  System.out.print(arr[i]+" ");
		        }
		       
	        }
		     
		

}
