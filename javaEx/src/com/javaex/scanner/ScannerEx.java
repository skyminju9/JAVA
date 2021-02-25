package com.javaex.scanner;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter num you want(int):");
		int value=scanner.nextInt(); //입력받을 값에 알맞는 메서드를 선택할것
		/* boolean nextBoolean(), byte nextByte(), long nextLong() ... etc */
		System.out.println(value);
		scanner.close();
	}
}
