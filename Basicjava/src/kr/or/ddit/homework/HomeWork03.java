package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork03 obj = new HomeWork03();
//		obj.question1();
		obj.question2();
	}
	
	public void question1() {
		/*
		 * 	정수 하나를 설정 하고 키보드로 임의의 수를 입력 받아.
		 * 	입력 받은 수가 크면 -> "더 작은 수를 입력하세요"
		 * 			 작으면-> "더 큰 수를 입력하세요"
		 * 			 같으면 종료
		 * 	설정된 값과 같은 값을 얼마만에 맞추는지를 출력 하시오.
		 * 
		 */
		
		int question = 120;
		int cnt = 0;
		while(true) {
			System.out.println("정수 하나를 입력하세요 : ");
			int answer = sc.nextInt();
			// cnt 숫자를 증가 시키키
			cnt++;
			if(answer>120) {
				System.out.println("더 작은 수를 입력하세요.");
			}
			if(answer<120) {
				System.out.println("더 큰 수를 입력하세요.");
			}
			if(answer==120) {
				System.out.println("정답입니다. 시도횟수 : "+cnt);
				break;
			}
		}

	
	}
	public void question2() {
		/*
		 *	&&, ||, ! 이용 해볼 것.
		 *	운년 : 4의 배수
		 *		100의 배수 x
		 *		400의 배수 o
		 *
		 * 	4 8 12 16 <- 윤년
		 * 	100 200 300 500 <- 운년x
		 * 	400 800 1200 <- 윤년
		 * 
		 */
		
		System.out.println("년도를 입력 : ");
		int year = sc.nextInt();
		
		boolean four = year%4==0;
		boolean hund = year%100==0;
		boolean fhund = year%400==0;
		
		if((four && !hund) || fhund) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}
//		if(year%4==0 && !(year%100==0) || year%400==0) {
//			System.out.println("윤년입니다.");
//		} else {
//			System.out.println("평년입니다.");
//		}
	}
}
