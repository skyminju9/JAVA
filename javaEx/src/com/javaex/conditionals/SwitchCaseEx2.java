package com.javaex.conditionals;
import java.util.Scanner;

public class SwitchCaseEx2 {

	public static void main(String[] args) {
		System.out.print("Enter month:");
		Scanner scanner = new Scanner(System.in);
		int month=scanner.nextInt();
		
		switch (month) {
		
		case 2:
			System.out.println("28 days");
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 days");
			break;
			
		default:
			System.out.println("31 days");
			break;			
		}
	}
}
