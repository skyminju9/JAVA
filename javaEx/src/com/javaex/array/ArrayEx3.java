package com.javaex.array;
import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		int[] intArray = new int[3];
		
		for (int i=0; i<intArray.length; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter num:");
			intArray[i] = scanner.nextInt();
			
		}
		for (int j=0; j<intArray.length; j++) {
			System.out.print(intArray[j]+ " ");
		}
	}
}
