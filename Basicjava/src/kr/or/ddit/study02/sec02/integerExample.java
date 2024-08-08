package kr.or.ddit.study02.sec02;

public class integerExample {
	public static void main(String[] args) {
		/*
		 *	정수형
		 *	1. byte		: 1byte(-128~127)
		 *	2. short	: 2byte(-32768~32767)
		 *	3. int		: 4byte(-2^31~2^31-1)	정수의 기본형
		 *	4. long		: 8byte(-2^63~2^64-1)
		 */
		
		byte b1 = 127;
		System.out.println("b1=" + b1);
		
//		byte b2 = 128;
		short s1 = 128;
		System.out.println("s1="+s1);
		
		short s2 = (short)(s1+10);
		
		int i1 = 100;
		int i2 = i1+10;
		
		long l1 = 1000;
		long l2 = 10000000000L;
		long l3 = i1+10;
	}

}
