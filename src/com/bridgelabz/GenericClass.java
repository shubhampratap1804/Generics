package com.bridgelabz;

public class GenericClass<E> {

	E[] myArray;

	public GenericClass(E[] myArray) {
		this.myArray = myArray;
	}

	public static void main(String[] args) {

		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.1, 3.1, 4.1, 5.1 };
		Character[] charArray = { 'a', 'b', 'c', 'd', 'e' };

		GenericClass.toPrint(intArray);
		GenericClass.toPrint(doubleArray);
		GenericClass.toPrint(charArray);
	}

	public static <E> void toPrint(E[] myArray) {
		for (E element : myArray) {
			System.out.println(element);
		}
		System.out.println();
	}

	public void toPrint() {
		GenericClass.toPrint(this.myArray);
	}

}
