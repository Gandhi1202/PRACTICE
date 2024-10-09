package com.java.problemsolving;
//8. Implement a method to find and return duplicate elements in an array of integers.
public class Duplicateelement {
	
	public static void duplicateArray(int arr[])
	{		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,23,43,2,12,23,12,33,42,33};
		   duplicateArray(arr);		
	}
}
