package kr.or.ddit.study06.sec06;

public class PrivateTest {
	static public int a; // 다른 패키지에서도 사용 가능
	static int b;
	static private int c; //내 클래스에서만 사용할 수 있다.
	
	public static void main(String[] args) {
		int a = PrivateTest.a;
		int b = PrivateTest.b;
		int c = PrivateTest.c;
		
	}
}
