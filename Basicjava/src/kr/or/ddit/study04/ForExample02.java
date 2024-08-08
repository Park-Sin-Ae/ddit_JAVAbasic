package kr.or.ddit.study04;

import java.util.Scanner;

public class ForExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample02 obj = new ForExample02();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
//		obj.method5();
		
		
	}
	
	public void method5() {
		/*
		 * 홀수만 출력해보기
		 */

		for (int i = 1; i < 20; i++) {	
			if (i%2 == 1) {
			    System.out.println(i);
			    
//		if -- continue; 사용 방법
//			for (int i = 1; i < 20; i++) {	
//				if (i%2 == 0) {       // i가 짝수이면,
//					continue;  		  // 계속해라. (그래서 아래로 안 내려가고 루프) // 홀수일 때 println
//				}
//				System.out.println(i);
			    
			}
	    }		
	}
		


		
	
	public void method4() {
		/*
		 *   전체 구구단을 출력하세요.
		 */
		
		for (int danL = 2; danL <= 9; danL++) {
		    	System.out.printf("\n%d 단입니다.\n", danL);
			for (int danR = 1; danR <= 9; danR++) {
				System.out.printf("%d * %d = %d\n", danL, danR, danL*danR);
			}
		}		
	}
	
	public void method3() {
		/*
		 *    입력받은 숫자로 구구단을 만드시오.
		 *    
		 *    ex 3)  3*1 = 3
		 *    		 3*2
		 *    	     3*3
		 *           .
		 *           .
		 *           3*9 = 27
		 */
		
		System.out.print("구구단의 단수를 입력하세요: ");
		int dan = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		
		
//		System.out.print("구구단의 단수를 입력하세요.");
//		int num = sc.nextInt();
//
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(num + " * " + i + " = " + num * i); 
//		}
			
		
				
		
	}
	
	public void method2() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method1() {
		/* 
		 * 영어를 입력한 후 영어에 포함된 모음의 개수를 구해보시오.
		 */
		
		System.out.println("단어 혹은 문장에 포함된 모음의 개수를 출력합니다.");
		System.out.print("영어 단어 혹은 문장을 입력하세요: ");
		String str = sc.next();
				
//		//문자열의 길이
		int length = str.length();
		
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ( ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i') {
				count++;
			}
		}
		System.out.println("모음의 개수: " + count);
	}
}
