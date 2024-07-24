package com.Task7;
import java.util.Map;
import java.util.TreeMap;
public class EmployeeTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a TreeMap to store employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Adding employee IDs and names to the TreeMap
        employeeMap.put(100, "John");
        employeeMap.put(102, "David");
        employeeMap.put(104, "Raj");
        employeeMap.put(106, "Kaushik");

        // Print the names of all employees in alphabetical order
        System.out.println("Employee names in alphabetical order:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

	}


