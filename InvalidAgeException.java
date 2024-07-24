package com.Task7;

public class InvalidAgeException {
	// Custom Exception class
	class Invalidageexception extends Exception {
	    public Invalidageexception(String message) {
	        super(message);
	    }
	}
	// Main class
	public class AgeValidator {
	    // Method to check age
	    public static void checkAge(int age) throws Invalidageexception {
	        if (age < 18) {
	            throw new Invalidageexception("Age is less than 18. Access denied.");
	        } else {
	            System.out.println("Access granted. Age is valid.");
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int userAge = 15; // Example age, you can change this value to test

	        try {
	            checkAge(userAge);
	        } catch (Invalidageexception e) {
	            System.out.println("Caught an exception: " + e.getMessage());
	        }
	    }
	}
	}


