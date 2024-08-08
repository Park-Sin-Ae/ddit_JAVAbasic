package kr.or.ddit.study04;

import java.util.Scanner;

public class SwitchExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SwitchExample obj = new SwitchExample();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
		obj.method5();
	}
	public void method5() {
		/*
		 * switch 문을 이용해서.
		 * 끝자리가 31(나머지)인달인지
		 * 		 30(4 6 9 11),
		 * 	 	 28, 29(2)일지 출력 할것.
		 */
		
		System.out.println("월을 입력해주세요.");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("끝자리가 31일입니다.");
			break;
		case 4: case 6: case 9: case 11: 
			System.out.println("끝자리가 30일입니다.");
			break;
		case 2:
			System.out.println("끝자리가 28, 29일입니다.");
			break;
		default:
			System.out.println("잘못 입력 되었습니다.");
			break;
		}
	}
	
	public void method4() {
		/*
		 * 학점
		 * A~F
		 * 
		 */
		
		int score = sc.nextInt();
		
		switch (score/10) {
		case 10:
			System.out.println("A+");
			break;
		case 9:
			System.out.println("A");
			switch(score%10) {
			case 0 : case 1 : case 2 :
				System.out.println("-");
				break;
			case 3 : case 4 : case 5 : case 6 :
				System.out.println("0");
				break;
			default:
				break;
			}
			break;
		case 8:
			System.out.println("B+");
			break;
		case 7:
			System.out.println("C+");
			break;
		case 6:
			System.out.println("D+");
			break;
		case 5:
			System.out.println("F+");
			break;

		default:
			break;
		}
		System.out.println("학점은 : " + score);
	}
	
	public void method3() {
		System.out.println("국가 명 입력");
		String nation = sc.next();
		
		switch (nation) {
		case "kor":
			System.out.println("한국 입니니다");
			break;
		case "jap":
			System.out.println("일본 입니니다");
			break;
		case "chn":
			System.out.println("중국 입니니다");
			break;
		default:
			break;
		}
	}
	
	public void method2() {
		/*
		 * 회원 등급 나누는 프로그램.
		 */
		System.out.println("회원 등급을 입력하세요 1~3");
		int grade = sc.nextInt();

		switch(grade) {
		case 1:
			System.out.println("vip");
			break;
		case 2:
			System.out.println("우수");
			break;
		case 3:
			System.out.println("일반");
		default:
			System.out.println("잘못 입력됨");
			break;
		}
	}
	
	public void method1() {
		/*
		 * switch 문
		 * 변수가 어떤 값을 갖는가에 따라 실행문 선택.
		 * if 문보다 코드가 간결함.
		 * 
		 * switch(변수){
		 * 		case 값 1:
		 * 		break;
		 * 		case 값2 "
		 * 		break;
		 * 		default;
		 * }
		 * 
		 */
		
		
	}

}
