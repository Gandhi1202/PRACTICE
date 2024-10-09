package com.java.problemsolving;

import java.util.Scanner;

public class WordCount {
	
	public static void  countWord(String str)
	{
		if(str==null||str.isEmpty())
		{
			System.out.println("Please enter String");
		}
		else
		{
			String[] str1=str.trim().split("\\s+");
			System.out.println(str1.length);
		}
		
	}
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
	                countWord(str);
	            } catch (Exception e) {
	                System.out.println("An error occurred: " + e.getMessage());
	            }
	        }
		 sc.close();
	}

}

