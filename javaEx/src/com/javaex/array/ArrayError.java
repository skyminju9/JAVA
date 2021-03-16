package com.javaex.array;

public class ArrayError {

	public static void main(String[] args) {
		int[] intArray;
		intArray = new int[5];
		
		intArray[0]=3;
		intArray[1]=6;
		intArray[2]=9;
		
		int res = 0;
		for (int i=0; i<=intArray.length; i++) { //intArray[5]라는, 존재하지 않는 인덱스에 접근하게 되므로 error
			res += intArray[i];
		}		
		System.out.println("intArray의 4번째 값: "+ intArray[3]);
	}
}
