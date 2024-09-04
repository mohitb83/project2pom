package testDriven;

import java.util.Scanner;

public class JavaProgram {

//	public static void main(String[] args) {
//		
//		int n = 100;
//		
//		for (int i=1; i<=n; i++) {
//			
//			if (i % 3 ==0 && i % 5 == 0) {
//				System.out.println("Number is "+i+" hence printing Fizz Buzz");			
//			}
//			else if (i % 3 ==0) {
//				System.out.println("Fizz");			
//			}
//			else if (i % 5 == 0) {
//				System.out.println("Buzz");			
//			}
//			else {
//				System.out.println(i);
//			}
//		}
//	}
	
	
	public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the upper limit
        System.out.print("Enter the upper limit for FizzBuzz: ");
        int n = scanner.nextInt(); // Read the integer input from the user

        // Ensure the user inputs a positive number
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            scanner.close();
            return; // Exit the program if the input is invalid
        }

        // Perform the FizzBuzz logic
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("The number is "+i+" hence printing FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("The number is "+i+" hence printing Fizz");
            } else if (i % 5 == 0) {
                System.out.println("The number is "+i+" hence printing Buzz");
            } else {
                System.out.println("Number not full divisible: "+i);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
