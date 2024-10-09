package com.java.problemsolving;
//5. Write a recursive method to compute the factorial of a given non-negative integer.
import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter the number (or type 'exit' to quit):");
            String str = sc.nextLine();
            
            if (str.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program.");
                break;
            }
            
            try {
                int number = Integer.parseInt(str);
                factorial(number);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number only.");
            }
        }
        
        sc.close();
    }
    
    public static void factorial(int num) {
        long fact = 1; 
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else if (num == 0) {
            System.out.println("Factorial of 0 is 1");
        } else {
            for (int i = num; i >= 1; i--) {
                fact *= i; 
            }
            System.out.println("Factorial of " + num + " is " + fact);
        }
    }
}
