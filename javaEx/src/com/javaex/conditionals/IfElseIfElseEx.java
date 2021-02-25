package com.javaex.conditionals;
import java.util.Scanner;

public class IfElseIfElseEx {

	public static void main(String[] args) {
		System.out.print("Enter num:");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		if (num>0) {
			System.out.printf("%d은(는) 양수입니다", num);
		}
		else if (num<0) {
			System.out.printf("%d은(는) 음수입니다", num);
		}
		else {
			System.out.println("0입니다");
		}
	}
}
