package com.java.problemsolving;
//2. Write a method that takes two strings and checks if they are anagrams of each other (e.g., "listen" and "silent").
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	public static void anagram(String str1,String str2)
	{
		
		
		String str11= str1.replaceAll("\\s+","");
		String str21=str2.replaceAll("\\s+","");
		if(str11.length()!=str21.length())
		{
			System.out.println("Not an Anagaram");
		}
		else
		{
			char[] ch1=str11.toCharArray();
			char[] ch2=str21.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			boolean AnagramString=Arrays.equals(ch1, ch2);
			if(AnagramString)
			{
				System.out.println("anagram");
			}
			else {
				System.out.println("not anagram");
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		  
		while(true)
		{
			System.out.println("enter the first string: or type exit to quit");
			String str1=sc.nextLine();
			if(str1.equalsIgnoreCase("exit"))
			{
				System.out.println("Exit the String 1");
				break;
			}
			System.out.println("enter the second string:or type exit to quit");
			String str2=sc.nextLine();
			if(str2.equalsIgnoreCase("exit"))
			{
				System.out.println("Exit the String 1");
				break;
			}
			anagram(str1,str2);
		}
		sc.close();	
	}
}
