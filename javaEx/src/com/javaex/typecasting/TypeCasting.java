package com.javaex.typecasting;

public class TypeCasting {

	public static void main(String[] args) {
		int num1=2;
		float num2=1.2F;
		float multiply=num1*num2;
		
		System.out.println(multiply); //암묵적 형변환
		
		int intValue=103029770;
		byte byteValue=(byte)intValue;
		System.out.println(byteValue); //자료의 유실 발생
		
		int intValue2=10;
		byte byteValue2=(byte)intValue2;
		System.out.println(byteValue2);
	}
}
