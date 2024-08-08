package kr.or.ddit.study06.sec06;

public class SalaryMan {

	private String name; //접근자 default 이다
	private int age;	//접근자 default 이다
	
	// get
	// public 타입 get컬럼명()
	
	public int getAge() {
		return age; // 데이터를 가져간다 개념
	}

	// set
	// public void set컬럼명(타입 컬럼명)
	
	
	public void setAge(int age) {
		if(age < 0 || age > 122) {
			System.out.println("올바른 데이터가 아닙니다.");
		}else {
			this.age = age;
		}
		
		
	}
	
	@Override
	public String toString() {
		return "SalaryMan [name=" + name + ", age=" + age + "]";
	}
	
	
	
}


