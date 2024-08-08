package kr.or.ddit.study04;

import java.util.Scanner;

public class WhileExample {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		WhileExample obj = new WhileExample();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
		obj.method5();
		
		
	}
	
	
	public void method5() {
		
//		 1. break만 썼을 때 --
//		 2. 라벨을 붙이는 방법
//		    -- END : ~ // break END;  
//		    -- END라는 라벨을 붙인 것 (A, B, a, b 등 라벨의 이름은 알아서)
//		    -- 어떤 걸 break(종료)시킬 지 라벨을 붙인 것
//		    -- 가장 가까운 것을 종료 시킴	
		
		End : while(true) {
			System.out.println("바깥쪽 while문 실행");
			while(true) {
				System.out.println("안쪽 while문 실행");
				try {
					Thread.sleep(1500);   // - 컴퓨터 실행을 1.5초씩 멈추는 것, 1000이면 1초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break End;	
			}
		}
	}
	


	
	public void method4() {
		int i = 1;
		do {
			System.out.println(i + "실햄 됨.");
			i++;
		}
		while(i < 10);
	}
	
	public void method3() {
		int i = 0;
		while (i < 0) {
			i++;
			System.out.println(i);
		}
		
		
		/*
		int i = 1;
		while ( i > 0 ) {
			i+=100;
			System.out.println(i);
		}
	}
	*/

//  int 범위 밖까지 넘어가면
//	제일 큰 숫자에 + 1을 더하게 되면 값이 넘쳐서 -- 오버 플로우가 되어
//	-값이 되어버림 
//	이런 경우 조심하기 !! 꽤나 있는 경우 int -> long
//	반대도 있음 -- 언더 플로우
		
	}

	
	public void method2() {
		/*
		 *   커피 매장
		 *   메뉴 
		 *    - 아메리카노           : 1000
		 *    - 카페라떼              : 1500
		 *    - 자바칩 프라프치노 : 2000
		 *    		 *    
		 */
		
		int sum = 0;
		String bill = "******영수증******\n";
		
		while(true) {
			System.out.println("========= 메뉴 =========");
			System.out.println("1. 아메리카노           : 1000");
			System.out.println("2. 카페라떼              : 1500");
			System.out.println("3. 자바칩 프라프치노 : 2000");
			System.out.println("4. 주문 완료.");
			System.out.println("=======================");
			int select = sc.nextInt();
			
			if (select == 1) {
				sum+=1000;
				bill+="아메리카노 : 1000원\n";
			}
			else if (select == 2) {
				sum+=1500;
				bill+="카페라떼 : 1500원\n";
			}
			else if (select == 3) {
				sum+=2000;
				bill+="자바칩 프라프치노 : 2000원\n";
			}
			if (select == 4) {
				break;
			}
		}
		System.out.println("주문이 완료 되었습니다.");
		System.out.println();
		System.out.println(bill);
		System.out.println("총 금액: " + sum);
		


		
		
		
		
	}
	
	public void method1() {
		/*
		 *   while 반복문 
		 *     -- 무한루프 등을 사용할 때 주로 사용.
		 *     -- (끝나는 지점을 알기 어려울 때 사용)
		 * 
		 *   while(조건식) {
		 *        실행문
		 */
		
//		int num = 0;
//		while ( num < 10 ) {
//			System.out.println(num++);
//		}
		
//		위의 while문 같은 경우는 for문으로 적는 게 좋다. 
//		for (int num = 0; num < 10, num++) {
		
//		while( true ) {
//			System.out.println("실행중");
//		}

//		아래 for문 같은 경우는 위 처럼 while문을 써주는 것이 좋고.
		for( ;; ) {
			System.out.println("실행중");
		}
		
	}

}
