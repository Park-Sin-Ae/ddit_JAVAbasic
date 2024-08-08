package kr.or.ddit.study06.sec06;

public class SingleTon {
	private static SingleTon instance = null;
	
	private SingleTon() {}
	public static SingleTon getInstance() {
		if(instance == null) {
			instance = new SingleTon(); // 로딩이 길어지는 프로그램을 사용할 때 singleton 사용 (검색엔진)
		}
		return instance;
		
		
	}
}
