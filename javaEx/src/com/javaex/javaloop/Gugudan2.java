package com.javaex.javaloop;
import java.util.Scanner;

public class Gugudan2 {

	public static void main(String[] args) {
		System.out.print("Enter dan:");
		Scanner scanner = new Scanner(System.in);
		int dan=scanner.nextInt();
		System.out.printf("%d단\n", dan);
		
		for (int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		scanner.close();
	}
}
