package com.Task7;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayIndexOutOfBoundsException 
        try {
            int[] array = {4, 5, 6};
            // This will throw ArrayIndexOutOfBoundsException
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e.getMessage());
        }

        // StringIndexOutOfBoundsException 
        try {
            String str = "World";
            // This will throw StringIndexOutOfBoundsException
            System.out.println(str.charAt(6));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index is out of bounds: " + e.getMessage());
        }
    }

	}


