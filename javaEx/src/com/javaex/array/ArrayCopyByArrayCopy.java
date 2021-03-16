package com.javaex.array;

public class ArrayCopyByArrayCopy {

	public static void main(String[] args) {
		int[] intArray= {1, 2, 3};
		int[] newArray = new int[10];
		
		System.arraycopy(intArray, 0,
				newArray, 0,
				intArray.length);
		
		for(int i = 0; i<newArray.length; i++) {
			System.out.println(newArray[i]+" ");
		}
		System.out.println();
	}
}
