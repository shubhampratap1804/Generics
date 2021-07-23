package com.bridgelabz;

public class Maximum<E extends Comparable<E>> {

	E x, y, z, a;

	public Maximum(E x, E y, E z, E a) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.a = a;
	}

	// Main method

	public static void main(String[] args) {

		// Declaring Integer object variables

		Integer xInt = 4, yInt = 5, zInt = 6, aInt = 7;
		Float xFloat = 1.1f, yFloat = 1.2f, zFloat = 1.3f, aFloat = 1.4f;
		String xString = "pear", yString = "apple", zString = "orange", aString = "mango";

		// Creating objects, passing variables and then calling maximum method

		new Maximum(xInt, yInt, zInt, aInt).allMaximum();
		new Maximum(xFloat, yFloat, zFloat, aFloat).allMaximum();
		new Maximum(xString, yString, zString, aString).allMaximum();
	}

	// Method to check which object variable is maximum

	public static <E extends Comparable<E>> E maximum(E x, E y, E z, E a) {
		E max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(y) > 0) {
			max = z;
		}
		if (z.compareTo(a) > 0) {
			max = z;
		} else
			max = a;

		maximum(x, y, z, a, max);
		return max;
	}

	// Method to print which object variable is maximum as a string

	public static <E> void maximum(E x, E y, E z, E a, E max) {
		System.out.printf("Maximum of %s, %s, %s and %s is %s \n", x, y, z, a, max);
	}

	public E allMaximum() {
		return Maximum.maximum(x, y, z, a);
	}
}
