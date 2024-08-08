package kr.or.ddit.study03;

public class ArithMeticExample {
	public static void main(String[] args) {
		/*
		 * 	산술 연산자
		 * 	+, -, /, *, %
		 * 	사칙연산과 마찬가지로/, *우선적용.
		 */
		
		int a = 7;
		int b= 5;
		System.out.println("덧셈 = "+(a+b));
		System.out.println("뺄셈 = "+(a-b));
		System.out.println("나눗셈 = "+(a/b));
		System.out.println("곱셈 = "+(a*b));
		System.out.println("나머지 = "+(a%b)); // 홀수인지 짝수인지 구분할 때
	}

}
