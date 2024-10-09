package com.java.problemsolving;
//3. Write a method that takes an array of integers and returns the largest element. Handle cases where the array might be empty.
import java.util.Scanner;

public class LargestElementInArray {
	public static void maxNumber(int arr[])
	{
		int index=0;
		int max=arr[index];
		
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(max);
		
	}

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        
	        while (true) {
	            System.out.print("Size of the array (or type 'exit' to quit): ");
	            String input = sc.nextLine();
	            
	            if (input.equalsIgnoreCase("exit")) {
	                System.out.println("Exiting the program.");
	                break;
	            }
	            
	            try {
	                int number = Integer.parseInt(input);
	                if (number <= 0) {
	                    System.out.println("Please enter a positive number for the size of the array.");
	                    continue;
	                }
	                
	                int arr[] = new int[number];
	                
	                System.out.println("Enter " + number + " elements:");
	                for (int i = 0; i < arr.length; i++) {
	                    arr[i] = sc.nextInt();
	                }
	                sc.nextLine(); // Clear the newline character after reading an integer
	                maxNumber(arr);
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input! Please enter a valid number.");
	            } catch (Exception e) {
	                System.out.println("An error occurred: " + e.getMessage());
	            }
	        }
	        
	        sc.close();
	}

}
