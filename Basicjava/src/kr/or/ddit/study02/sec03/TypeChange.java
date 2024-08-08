package kr.or.ddit.study02.sec03;

public class TypeChange {
	public static void main(String[] args) {
		// 자동 타입 변환
		// 작은 범위 -> 큰 범위
		int i = 10;
		long l = i;
		System.out.println("롱 타입입니다." +1);
		
		// 강제 타입 변환
		// 큰 범위 -> 작은 범위
		// type 변수명 = (type)변수명;
		long l2 = 1000;
		int i2 = (int)l2;
		System.out.println("int 타입입니다. " +l2 +"," +i2);
		
		/*
		 *  double -> int 타입 변환해보기
		 */
		
		double l3 = 99.5;
		int i3 = (int)l3;
		System.out.println("double -> int " +l3+","+i3);
		
		/*
		 *  int -> double 타입 변환해보기
		 */
		
		int l4 = 20;
		double i4 = (double)l4;
		System.out.println("int -> double " +l4 + "," +i4);
		
		/*
		 *  char ->int 타입 변환해보기
		 */
		
		char l5 = 'a';
		int i5 = (int)l5;
		System.out.println("char -> int " +l5+","+i5);
		
		/*
		 *  int -> char 타입 변환해보기
		 * 
		 */
		
		int l6 = 99;
		char i6 = (char)l6;
		System.out.println("int -> char " +l6+","+i6);
		
		/*
		 *  소문자 a를 대문자 A로 변환하기
		 */
		
		char c8 = 'a';
		char c8_1 = (char)(c8-32);
		System.out.println((int)'a' + "," + (int)('A'));
		System.out.println("소문자 -> 대문자 타입 변환 " +c8+","+c8_1);
		
		/*
		 *  대문자 D를 소문자 d로 변환하기
		 */
		
		char c9 = 'D';
		char c9_1 = (char)(c9+32);
		System.out.println("대문자 -> 소문자 타입 변환 " +c9+","+c9_1);
		
		
		/*
		 *  int -> String 변환하기.
		 */
		
		int i10 = 10;
		double d10 = 6.7;
//		String s10 = "" + i10;
		String s10 = i10 + d10 + "";
//		s10 = String.valueOf(i10);
		System.out.println(s10);
//		System.out.println("int -> String 타입 변환 " +i10+","+i10_1);
	}
}
