package com.javaex.javaloop;
import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		int total=0;
		int value=0;
		
		do {
			System.out.print("Enter num(enter 0 to quit):");
			Scanner scanner = new Scanner(System.in);
			value=scanner.nextInt();
			total += value;
			System.out.printf("Total : %d\n", total);
			if (value==0) {
				System.out.println("Exited");
			}
		} while (value != 0);
	}
}
