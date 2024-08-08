package kr.or.ddit.study07.sec01.phone;

public class IPhone1Gen extends SmartPhone {
	public void appstore() {
		System.out.println("앱스토어");
	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
//		super.camera(); // 부모클래스에 있는 카메라 메서드를 가져오는것 super == 부모클래스
		System.out.println("1000만 화소 카메라");
	}
	
}
