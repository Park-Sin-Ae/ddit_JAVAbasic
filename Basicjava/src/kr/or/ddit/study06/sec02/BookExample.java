package kr.or.ddit.study06.sec02;

public class BookExample {
	public static void main(String[] args) {
		// 책 클래스 2개 만들고 각각 데이터 입력 및 출력해보기.
		Book bk1 = new Book();
		
		bk1.title = "개미";
		bk1.writer = "베르나르 베르베르";
		bk1.date = "2023년12월25일";
		bk1.expln = "베르나르 베르베르의 대표작이다";
		
		
		Book bk2 = new Book();
		bk2.title = "낙하하는 저녁";
		bk2.writer = "요시모토 바나나";
		bk2.date = "1992년1월16일";
		bk2.expln = "요시모토 바나나의 두번째 작품";
		
		System.out.println(bk1);
		System.out.println(bk2);
		
	}

}
