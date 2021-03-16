package com.javaex.array;

public class ArrayCopyByFor {

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3 };
		int[] newArray = new int[10];
		
		for (int i = 0; i<intArray.length; i++) {
			newArray[i] = intArray[i];
		}
		for (int i = 0; i<newArray.length; i++) {
			System.out.println(newArray[i]+" ");
		}
		System.out.println();
	}
}
