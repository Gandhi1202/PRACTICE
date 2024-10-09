package com.java.problemsolving;
//7. Write a method that reverses a given string without using built-in reverse methods.
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the word");
		 String word= sc.nextLine();
		System.out.println(reverse(word));
		sc.close();

	}
	
	
	 public static  String reverse(String str)
	 {
		 String result="";
		 for(int i=str.length()-1;i>=0;i--)
		 {
			 System.out.print(str.charAt(i));
		 }
		return result;
		
			
		
	 }

}
