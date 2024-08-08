package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork04 obj = new HomeWork04();
		obj.process();
		
	}
	
	public void process() {
		/*
		 * 가위 바위 보
		 * 0   1 2
		 * 
		 * 컴퓨터가 가위바위보를 랜덤으로
		 * 뽑게 하고 내가 입력한 숫자랑 비교햇
		 * 
		 * 이겼으면 이겼다.
		 * 졌으면 졌다
		 * 비겼으면 비겼다 출력
		 * 
		 * ex) com 0 user 1
		 * 
		 * -> 컴퓨터 : 가위, 유저: 바위
		 * 당신이 이겼습니다.
		 */
		
		int com = (int)(Math.random()*3);
		System.out.println(com);
		
		int user = sc.nextInt();
		
		switch(com) {
		case 0:
			switch(user) {
				case 1:
					System.out.println("바위");
					System.out.println("컴퓨터 : 가위 , 유저 : 바위" );
					System.out.println("당신이 이겼습니다" );
					break;
				case 2:
					System.out.println("보");
					System.out.println("컴퓨터 : 가위 , 유저 : 보" );
					System.out.println("당신이 졌습니다" );
					break;
				default :
					System.out.println("컴퓨터 : 가위 , 유저 : 가위" );
					System.out.println("비겼습니다" );
					break;
			}
			
		case 1:
			switch(user) {
			case 1:
				System.out.println("바위");
				System.out.println("컴퓨터 : 바위 , 유저 : 바위" );
				System.out.println("당신이 이겼습니다" );
				break;
			case 2:
				System.out.println("보");
				System.out.println("컴퓨터 : 바위 , 유저 : 보" );
				System.out.println("당신이 이겼습니다" );
				break;
			default :
				System.out.println("컴퓨터 : 바위 , 유저 : 가위" );
				System.out.println("당신이 졌습니다" );
				break;
				
			}
		case 2:
			switch(user) {
			case 1:
				System.out.println("바위");
				System.out.println("컴퓨터 : 보 , 유저 : 바위" );
				System.out.println("당신이 졌습니다" );
				break;
			case 2:
				System.out.println("보");
				System.out.println("컴퓨터 : 보 , 유저 : 보" );
				System.out.println("비겼습니다" );
				break;
			default :
				System.out.println("컴퓨터 : 보 , 유저 : 가위" );
				System.out.println("당신이 이겼습니다" );
				break;
				
			}

		}
	}
}
