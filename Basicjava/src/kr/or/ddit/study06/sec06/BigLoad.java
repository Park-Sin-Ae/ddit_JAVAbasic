package kr.or.ddit.study06.sec06;

public class BigLoad {
	private static BigLoad instance = null;

	public BigLoad() {
		try {
			Thread.sleep(5000); // 5초 동안 실행을 멈춘다
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static BigLoad getInstance() {
		if (instance == null) {
			instance = new BigLoad();
		}
		return instance;
	}
}
