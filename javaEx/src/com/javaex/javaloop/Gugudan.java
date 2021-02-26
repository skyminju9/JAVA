package com.javaex.javaloop;
import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		System.out.print("Enter dan:");
		Scanner scanner = new Scanner(System.in);
		int dan=scanner.nextInt();
		int i=1;
		System.out.printf("%d단\n", dan);
		
		while (i<10) {
			System.out.printf("%d * %d = %d \n", dan, i, dan*i);
			i += 1;
		}
		scanner.close(); //resource leak 방지를 위해 System.in 스트림을 닫아줌
	}
}
