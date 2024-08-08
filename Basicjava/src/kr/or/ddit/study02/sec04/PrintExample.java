package kr.or.ddit.study02.sec04;

import java.util.Scanner;

public class PrintExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		PrintExample obj = new PrintExample();
//		obj.printLn();
//		obj.print();
//		obj.printf();
		obj.printf2();
	}
	public void printf2() {
		/*
		 * 	나이와 이름 넣어 보기.
		 */
		String age = sc.next();
		int ageI = Integer.parseInt(age);
		String name = sc.next();
		
		System.out.printf("이름: %1s\t 나이 : %2d", name,ageI);
	}
	
	public void printf() {
		//	줄바꿈 기능
//		System.out.printf("형식지정문자열", 변수 리스트);
//		형식 문자열
// 		-> "%%[[-|0]n]d 10진 정수
//		-> - 왼쪽정렬
//		-> 0 남은 왼쪽 빈공간에 0 채움
		System.out.printf("숫자 : %d\n", 1000);
		System.out.printf("숫자 : %8d\n", 1000); //  기본적오료 8칸
		System.out.printf("숫자 : %-8d\n", 1000);	// 기본적으로 8칸인데 왼쪽 정렬
		System.out.printf("숫자 : %08d\n", 1000);	// 나머지공간을 0으로 넣는다
	}
	
	public void print() {
		//	줄바꿈 기능 x
		System.out.print("홀길동");
		System.out.print(" 34061");
		System.out.print("   대전시 중구 계룡로");
	}
	
	public void printLn() {
		//	줄바꿈 기능
		System.out.println("홀길동");
		System.out.println(" 34061");
		System.out.println("   대전시 중구 계룡로");
	}
}
