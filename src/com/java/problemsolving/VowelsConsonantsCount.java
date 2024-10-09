package com.java.problemsolving;
//11. Write a method that compresses a string using the counts of repeated characters (e.g., "aabcccccaaa" becomes "a2b1c5a3").
import java.util.Scanner;

public class VowelsConsonantsCount {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		  

		 while (true) {
	            System.out.println("Enter a quote (or type 'exit' to quit):");
	            String str = sc.nextLine();
	            
	            if (str.equalsIgnoreCase("exit")) {
	                System.out.println("Exiting the program.");
	                break;
	            }
	            
	            try {
	            	countCharacter(str);
	            } catch (Exception e) {
	                System.out.println("An error occurred: " + e.getMessage());
	            }
	        }
		 sc.close();
		

	}
 
	public static void countCharacter(String str)
	{ 
		int vowelcount=0;
		int consonantcount=0;
		String str1=str.replaceAll("[^a-zA-Z]","").toLowerCase();
		char[] ch=str1.toCharArray();
		for(int i=0;i<str1.length();i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				vowelcount++;			
			}
			else
			{
				consonantcount++;
				
			}
		}
		System.out.println("vowel count: "+vowelcount);
		System.out.println("consonant count : "+consonantcount);
		
		
	}
}
