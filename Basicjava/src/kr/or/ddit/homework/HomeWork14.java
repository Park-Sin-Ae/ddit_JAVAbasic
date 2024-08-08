package kr.or.ddit.homework;

import java.util.Random;

public class HomeWork14 {
	public static void main(String[] args) {
		HomeWork14 hw = new HomeWork14();
		
		Deck deck = new Deck();
		Card[] cardList = deck.cardList();
		deck.print(cardList);
		deck.shuffle(cardList);
		boolean win = deck.win(cardList);
		if(win) System.out.println("당신이 이겼습니다.");
		else System.out.println("당신이 졌습니다.");
		
	}
}
class Card{
	String type;
	int num;
	public Card(String type, int num) {
		this.type = type;
		this.num = num;
	}
	@Override
	public String toString() {
		String n = "";
		if(num==1) n = "A";
		else if(num==10) n = "T";
		else if(num==11) n = "J";
		else if(num==12) n = "Q";
		else if(num==13) n = "K";
		else n += num;
		return type+n;
		
//		return type+"";
//		return "Card [type=" + type + ", num=" + num + "]";
	}
	
}

class Deck{
	// card[] cardList;
	
	public Card[] cardList() {
		Card[] cardList = new Card[52]; // for문의 결과값을 배열을 저장한다.
		for(int i = 1; i <= 52; i++) {
			int num = i%13;
			if(num==0) num = 13;
			String type = "";
			if(i/13 == 0) type = "♠";
			if(i/13 == 1) type = "◈";
			if(i/13 == 2) type = "♥";
			if(i/13 == 3) type = "♣";
			cardList[i-1] = new Card(type, num); // 배열이 0 부터 시작하기 때문에 -1 을 해준다.
		}
		
		return cardList;
	}
	
	public void print(Card[] cardList) {
		for(Card card : cardList) {
			System.out.println(card);
		}
	}
	// 카드섞기
	// 랜덤으로 카드 뽑기
	// 상대가 높은 숫자 카드를 뽑으면 이기는 게임 만들기
	
	public void shuffle(Card[] cardList) {
//		for(int i = 0; i<10000; i ++) {
//			int ran = (int)(Math.random()*cardList.length);
//			Card temp = cardList[0];
//			cardList[0] = cardList[ran];
//			cardList[ran] = temp;
//			System.out.println(temp);
//		}
		for(int i = 0; i < 1000; i++) {
			/*
			 * (int)(Math.random()*52)
			 * 			(==)
			 * new Random().nextInt(52)
			 */
			int ran = new Random().nextInt(52);
			Card  temp = cardList[0];
			cardList[0] = cardList[ran];
			cardList[ran] = temp;
		}
	}
	
	public boolean win(Card[] cardList) {
		// 카드 숫자가 내 카드가 높다면 win -> true
		// 카드 숫자가 내 카드가 낮다면 lose -> false
//		boolean win[] = new boolean[52]; // 중복 초기화
//		int com = (int)(Math.random()*cardList.length);
//		int user = (int)(Math.random()*cardList.length);
//		System.out.println("user : " + user);
//		System.out.println("com : " + com);
//		if(com>user) {
//			System.out.println("당신이 졌습니다.");
//			return false;
//			
//		}else {
//			System.out.println("당신이 이겼습니다.");
//			return true;
//		}
	
		
		Card user = cardList[0];
		int ran = new Random().nextInt(51)+1; // 내 카드 제외
		Card com = cardList[ran];
		System.out.println("USER : " + user);
		System.out.println("COM : " + com);
		if(com.num < user.num) return true;
		return false;
		
	}
}
