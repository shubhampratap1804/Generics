package com.bridgelabz;

public class PrintArrays {

	private static <E> void toPrint(E [] array) {
		for (E i : array) {
			System.out.println(i);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.1, 3.1, 4.1, 5.1 };
		Character[] charArray = { 'a', 'b', 'c', 'd', 'e' };

		toPrint(intArray);
		toPrint(doubleArray);
		toPrint(charArray);

	}
}
