package kr.or.ddit.study08;

public class BoardImple implements IBoard { //여러개의 상속을 받을 수 있다.(다중 상속)
	
	// 인터페이스는 설계도 이다.
	// 이 안에 메서드를 만들 수 없으며 반드시 상속을 받아야한다. 혼자만으로 동작 할 수 없음
	// abstract 는 클래스를 하나만 사용 할 수 있다.
	// super.메소드  부모를 상속받는다.
	@Override
	public void writeBoard(String title, String content) {
		
		ILogin login = null;
		
		// 핸드폰 여부 체크
		boolean phonchk = false;
		
		if(phonchk) login = new MobileLoginImple();
		else login = new LoginImple();
		
		login.login("id", "pass");
		
		/*
		 * 디비에 데이터 넣어주기.
		 */
		
	}

	
}
