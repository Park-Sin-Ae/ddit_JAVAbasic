package kr.or.ddit.study06.sec03;

public class Constructor {
	int a;
	int b;
	int c;
	int d;
	
	public Constructor() {
		
	}
	
	public Constructor(int a) {
//		this.a = a;
		// b 값에 20을 기본으로 넣는 생성자
		// this 를 이용해서 호출해볼 것.
		this(a, 20);
		System.out.println("Constructor(int a)호출");
	}

	public Constructor(int a, int b) {
		this(a, b, 10, 10); // c, d 값이 고정인경우
		System.out.println("Constructor(int a, inb b)호출");
		
	}
	Constructor(int a, int b, int c, int d){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		System.out.println("Constructor(int a, inb b, inb c, inb d)호출");
	}
}
