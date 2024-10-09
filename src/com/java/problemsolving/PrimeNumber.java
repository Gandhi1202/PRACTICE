
//Create a method that checks if a given number is prime.
package com.java.problemsolving;

import java.util.Scanner;

public class PrimeNumber {
    
    public static String primeNumber(int number) {
        if (number < 0) {
            return number + " is invalid. Enter positive numbers only.";
        }
        if (number == 1) {
            return number + " is not a prime number.";
        }
        for (int i = 2; i<=number/2; i++) { // More efficient check
            if (number % i == 0) {
                return number + " is not a prime number.";
            }
        }
        return number + " is a prime number.";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter the number (or type 'exit' to quit):");
            String input = sc.nextLine();
            
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program.");
                break;
            }
            
            try {
                int number = Integer.parseInt(input);
                System.out.println(primeNumber(number));
            } catch (NumberFormatException nfe) {
                System.out.println("Enter a valid number only or a natural number greater than 1.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        sc.close();
    }
}
