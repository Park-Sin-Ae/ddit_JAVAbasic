package kr.or.ddit.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeWork19 {
	public static void main(String[] args) {
		HomeWork19 hw = new HomeWork19();
		hw.printHistogram(1000);
//		hw.twoDice();
//		System.out.println(hw.oneDice());
//		System.out.println(hw.throwDice());
//		System.out.println(hw.twoDice());
		List list = hw.throwDice(13);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		/*
		 * 1. 주사위 1개 던지는 메소드 만들기.
		 * 1~6
		 * 
		 * 2. 주사위 2개 던지는 메소드  만들기
		 * 	-> 1 메소드 활용
		 * 
		 * 3. 주사위 2개를 여러번 던지는 메소드 만들기
		 * 	-> 파라미터 int num
		 * arryList에 던질때마다 값을 기록한다.
		 * 전체 만번을 던졌을때  백분율로 구할것 
		 * 확률을 숫자가 아닌 별로 출력 (별 하나당 1%)
		 * 
		 * 4. 주사위 2개를 num 만큼 실행 한 결과 값을 출력하기
		 * 	-> 3 메소드 활용.
		 * 
		 * 2 **
		 * 3 ***
		 * 4 *****
		 * 5 ********
		 * 6 **********
		 * 7 ************
		 * 8 ********
		 * 9 *****
		 * 10 ****
		 * 11 **
		 * 12 **
		 */
		
	}
	public int oneDice() {
		int dice1 = new Random().nextInt(6)+1;
		return dice1;
		
	}
	
	public int twoDice() { 
		
		return oneDice() + oneDice();
	}
	
	public List throwDice(int num) {
		List<Integer> l = new ArrayList();
//		int[] numList = new int[13];
		for(int i = 0; i<num; i++) {
			l.add(twoDice());
		}

//		numList[결과값]++;
//		System.out.println(num);
		return l;
	}
	
	public void printHistogram(int num) {
		List numList = throwDice(num);
		for (int i = 0; i < numList.size(); i++) {
			System.out.println();
			for(int j = 0; j < numList.size()*100.0/num ; j++) {
				
				System.out.print("*");
			}
		}
		throwDice(num);
	}

}
