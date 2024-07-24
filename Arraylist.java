package com.Task7;
import java.util.ArrayList;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an ArrayList of strings
        ArrayList<String> list = new ArrayList<String>();

        // Add some elements to the ArrayList
        list.add("Water");
        list.add("Cloudy");
        list.add("Rain");

        // Print the ArrayList
        System.out.println("ArrayList before removing elements: " + list);

        // Remove all elements from the ArrayList
        list.clear();

        // Print the ArrayList after removing elements
        System.out.println("ArrayList after removing elements: " + list);
    }

	}


