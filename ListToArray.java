package com.Task7;
import java.util.ArrayList;
import java.util.List;
public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a list
        List<String> list = new ArrayList<>();
        list.add("World");
        list.add("Sky");
        list.add("Cloud");

        // Convert list to array
        String[] array = list.toArray(new String[0]);

        // Print the array
        for (String element : array) {
            System.out.println(element);
        }
    }

	}


