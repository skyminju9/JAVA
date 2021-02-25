package com.javaex.conditionals;
import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {
		System.out.println("choose class");
		System.out.println("1.JAVA   2.C   3.C++   4.Python");
		System.out.print("class number:");
		
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("classroom is R101");
			break;
			
		case 2:
			System.out.println("classroom is R202");
			break;
			
		case 3:
			System.out.println("classroom is R303");
			break;
			
		case 4:
			System.out.println("classroom is R404");
			break;
			
		default:
			System.out.println("Ask customer service agents");
			break;
		}
	}
}
