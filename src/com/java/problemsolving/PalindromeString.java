package com.java.problemsolving;
//1. Create a function that checks if a given string is a palindrome (reads the same forwards and backwards). Ignore spaces and punctuation.
import java.util.Scanner;

public class PalindromeString {
	
	public static void palindrome(String str)
	{
		String str1 = str.replaceAll("[^a-zA-Z0-9]", "");
		String rev="";
		for(int i=str1.length()-1;i>=0;i--)
		{
			char[] ch=str1.toCharArray();
			rev=rev+ch[i];
		
					
		}
		if(str1.equalsIgnoreCase(rev))
		{
			System.out.println(str+" palindrome");
		}
		else
		{
			System.out.println(str+" not a palindrome");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	  while(true)
	  {
		  System.out.println("Enter the string or type exit to exit the program");
		  String str=sc.nextLine();
		  if(str.equalsIgnoreCase("exit"))
		  {
			  System.out.println("Exit the code");
			  break;
		  }
		  palindrome(str);
		  
	  }
	  sc.close();
		
	}

}
