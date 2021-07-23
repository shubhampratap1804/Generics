package com.bridgelabz;

public class PrintArrayNormal {
	public static void main(String[] args) {

		int[] intArray = { 1, 2, 3, 4, 5 };
		double[] doubleArray = { 1.1, 2.1, 3.1, 4.1, 5.1 };
		char[] charArray = { 'a', 'b', 'c', 'd', 'e' };

		toPrint(intArray);
		toPrint(doubleArray);
		toPrint(charArray);
	}

	private static void toPrint(char[] charArray) {
		for (char i : charArray) {
			System.out.println(i);
		}

	}

	private static void toPrint(double[] doubleArray) {
		for (double i : doubleArray) {
			System.out.println(i);
		}
	}

	private static void toPrint(int[] intArray) {
		for (int i : intArray) {
			System.out.println(i);

		}
	}
}