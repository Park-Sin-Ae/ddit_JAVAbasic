package kr.or.ddit.study06;

public class ClassTest {
	
	private static int year;
	private int field1;
	// field 안에 객체가 없으면 실행되지 않는다.
	// 객체를 만들 기 위해 필요한게 생성자이다. 생성자를 만들지 않으면 기본 생성자가 만들어진다. 생성자가 하나라도 있으면 기본생성자가 만들어지지 않는다.
	public ClassTest() {
	}


	public ClassTest(int field1) { //생성자
		this.field1 = field1; // 객체 내부에 데이터 값을 저장한다.
	}

	// 메소드 시작
	public static int getYear() { // static은 값이 단 하나밖에 존재하지 않는다.
		return year;
	}


	public static void setYear(int year) {
		ClassTest.year = year;
	}


	public int getField1() {
		return field1;
	}


	public void setField1(int field1) {
		this.field1 = field1;
	}


	// 오버라이드는 부모가 만든 메소드를 재정의 함
	// 여기서 부모는 Object
	@Override
	public String toString() {
		return "ClassTest [field1=" + field1 + "]";
	}
	
	
	
}
