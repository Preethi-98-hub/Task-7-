package com.Task7;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Specify the path to the file
        String filePath = "data.txt";
        
        // Create a File object
        String file = new String(filePath);
        
        // Use a try-catch block to handle exceptions
        try {
            // Create a Scanner object to read from the file
            Scanner scanner = new Scanner(file);
            
            // Read and print the content of the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            
            // Close the scanner
            scanner.close();
            
        } catch (FileNotFoundException e) {
            // Handle the case where the file does not exist
            System.err.println("Error: The file " + filePath + " does not exist.");
        }
    }

	}


