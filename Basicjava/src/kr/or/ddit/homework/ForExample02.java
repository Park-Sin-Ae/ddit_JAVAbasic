package kr.or.ddit.homework;

import java.util.Scanner;

public class ForExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample02 obj = new ForExample02();
//		obj.method1();
		obj.method2();
	}
	
	public void method2() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("종료");
		}
	}
	
	public void method1() {
		/*
		 * 영어를 입력한 후에 영어에 포함된 모음의 개수를 구해보시오.
		 */
		
		String str = sc.next();
		
		// 문자열 길이.
		int length = str.length();
		
		int cnt = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u') {
				cnt++;
			}
			
		}
		System.out.println("모음의 개수는 : " + cnt);
	}
}
