package com.bridgelabz;

public class MaximumString {

	// Main method
	
	public static void main(String[] args) {

		//Declaring object variables
		String x = "Delhi";
		String y = "Mumbai";
		String z = "Bengaluru";
		printMax(x, y, z);
	}

	// Method to check which object variable is maximum
	
	public static <E extends Comparable<E>> E printMax(E x, E y, E z) {
		E max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(y) > 0) {
			max = z;
		}
		maximum(x, y, z, max);
		return max;
	}

	//Method to print which object variable is maximum as a string
	
	public static <E> void maximum(E x, E y, E z, E max) {
		System.out.printf("Maximum of %s, %s and %s is %s \n", x, y, z, max);
	}
}
