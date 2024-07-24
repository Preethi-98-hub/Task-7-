package com.Task7;
import java.util.Scanner;
public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            // Perform division
            int result = num1 / num2;

            // Display the result
            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }

	}


