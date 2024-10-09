package com.java.problemsolving;
//11. Write a method that compresses a string using the counts of repeated characters (e.g., "aabcccccaaa" becomes "a2b1c5a3").

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatedCountString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the String");
		 String word= sc.nextLine();
		repeteadCount(word);
		sc.close();	
	}
	
	public static void repeteadCount(String str)
	{
		
		String str1=str.replaceAll("[^a-zA-Z]","").toLowerCase();
	
		
		HashMap<Character,Integer> hmap= new HashMap<Character,Integer>();
		
		for(char ch:str1.toCharArray())
		{
			hmap.put(ch, hmap.getOrDefault(ch,0)+1);
		}
		for(Map.Entry<Character, Integer> countCharacter:hmap.entrySet())
		{
			System.out.println(countCharacter.getKey()+":"+countCharacter.getValue());
		}
		
		
	}
}
//public class FirstNonRepeatingCharacter {
//
//    public static void firstNonRepeatingCharacter(String str) {
//        Map<Character, Integer> charCount = new LinkedHashMap<>();
//
//        // Count the occurrences of each character
//        for (char c : str.toCharArray()) {
//            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
//        }
//
//        // Find the first non-repeating character
//        for (char c : str.toCharArray()) {
//            if (charCount.get(c) == 1) {
//                System.out.println(c); // Print the first non-repeating character
//                return; // Exit the method after printing
//            }
//        }
//
//        System.out.println("No non-repeating character found"); // Print if none found
//    }
//
//    public static void main(String[] args) {
//        String input = "swiss";
//        firstNonRepeatingCharacter(input); // Call the method
//    }
//}