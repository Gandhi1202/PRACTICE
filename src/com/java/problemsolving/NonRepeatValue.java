package com.java.problemsolving;
//12. Create a method that finds the first non-repeating character in a string. Use a Map to track character frequencies.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatValue {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("enter a string except exit or exit the code to type exit");
			String str=sc.nextLine();
			if(str.equalsIgnoreCase("exit"))
			{
				System.out.println("exit the program:");
				break;
			}
			 try {
	                nonRepatedValue(str);
	            } catch (Exception e) {
	                System.out.println("An error occurred: " + e.getMessage());
	            }
			
		}
		 sc.close();
	}
	
	public static void nonRepatedValue(String str) {
		String str1 = str.replaceAll("[^a-zA-Z0-9]", "").trim().toLowerCase();
		Map<Character, Integer> hmap = new HashMap<>();
		
		for (char ch : str1.toCharArray()) {
			hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
		}
		boolean check = false; // Flag to check if we found any non-repeating character
		for (char ch : str1.toCharArray()) {
			if (hmap.get(ch) == 1) {
				System.out.println("First non repeating character: "+ch); // Return the first non-repeating character
				check=true;
				break;
			}
		}
		if (!check) {
			System.out.println("No non-repeating characters found.");
		}
	}
}
