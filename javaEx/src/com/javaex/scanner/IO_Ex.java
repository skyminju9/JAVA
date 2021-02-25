package com.javaex.scanner;
import java.util.Scanner;

public class IO_Ex {

	public static void main(String[] args) {
		
		System.out.print("Enter your name:");
		Scanner name = new Scanner(System.in);
		String str=name.next();
		
		System.out.print("Enter your age:");
		Scanner age=new Scanner(System.in);
		int yage=age.nextInt();
		
		System.out.printf("your name is %s and your age is %d", str, yage);
	}
}
