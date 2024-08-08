package kr.or.ddit.study06.sec03;

public class CustomerExample {
	public static void main(String[] args) {
		/*
		 * Customner 클래스 3개 만들고 데이터 넣어보기.
		 */
		
		Customer cus1 = new Customer();
		cus1.age = 10;
		cus1.nation = "한국";
		cus1.name = "영희";
		
		Customer cus2 = new Customer("영국", "철수", 30);
		System.out.println(cus2);
		
		Customer cus3 = new Customer("미미", 25);
		System.out.println(cus3);
		
	}
	
}
