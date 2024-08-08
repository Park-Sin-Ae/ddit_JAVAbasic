package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork07 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork07 obj = new HomeWork07();
//		obj.process1();
		obj.process2();
		
	}
	
	public void process1() {
		/*
		 * 5개의 단어가 제공되며 이중 임의의 단어가 선택된다.
		 * 선택된 단어의 철자를 섞어 사용자에게 제시 하며
		 * 사용자는 이를 보고 원래의 단어를 입력한다.
		 * 사용자가 단어를 맞출때 가지 반복하여 단어를 맞추었을때
		 * 시도 횟수 출력. cnt++
		 */
		
		String[] words = {"apple", "banana", "love", "hope", "persimmon"};
		int ran = (int)(Math.random()*words.length);
		// words 배열 중에 랜덤한 겂을 뽑기.
		String word = words[ran];
		
		
		
		// 문자열 -> char 배열로 변환.
		// toCharArray
		int a = 10;
		int b = 7;
		int cnt = 0;
		
//		int temp = a; // temp = 10
//		a = b; // a = 7
//		b = temp; // b = 10
		char[] ch = word.toCharArray();
		for(int i = 0; i<1000; i++) {
			int cRan = (int)(Math.random()*ch.length);
			char temp = ch[cRan];
			ch[cRan] = ch[0]; //0번째로 섞는 이유는 어차피 반복되면 전체가 섞이기 때문 단지 기준임
			ch[0] = temp;
			
		}
		while(true) {
			cnt++;
			for(int i = 0; i< ch.length; i++) {
				char c = ch[i];
				System.out.print(c);
			}
			String answer = sc.next();
			if(word.equals(answer)) {
				break;
		}
			
	}System.out.println("정답입니다!!"+"시행횟수 : "+cnt++);
		
		
		
		
	}
	public void process2() {
		/*
		 * 거스름돈을 올바르게 주는 프로그램
		 * 75550 -> 만원 7개, 5천 1개, 500원 1개  50원 1개 0
		 */
		int money = 75550;
		
		int[] coin = {50000, 10000, 5000, 1000, 500, 50, 10};
		for(int i = 0; i<coin.length; i++) {
			int cnt = money/coin[i];
			if(cnt==0) continue;
			money = money%coin[i];
			System.out.print(coin[i]+ " " + cnt + "개 \t");
		}
		
	}
}
