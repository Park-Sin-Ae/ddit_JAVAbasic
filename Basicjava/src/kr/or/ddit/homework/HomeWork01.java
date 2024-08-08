package kr.or.ddit.homework;

public class HomeWork01 {
	public static void main(String[] args) {
		/*
		 *  지구 공전 주기 1년은 정확히 365일이 아니라
		 *  365.2422 일이다. 
		 *  
		 *  해당 시간을 다음과 같이 나타내보자.
		 *  1년은 ?일 ?시간 ?분 ? 초 입니다. 출력.
		 *   
		 */
		
		double day = 365.2422;
		int days = (int)day;
		
		double hour = (day -days)*24;
		int hours = (int)hour;
		
		double min = (hour -hours)*60;
		int mins = (int)min;
		
		double sec = (min	-mins)*60;
		int scnds = (int)sec;
		
//		System.out.println(days);
//		System.out.println(hour);
//		System.out.println(mins);
//		System.out.println(scnds);
		
		System.out.println("1년은 " + days + "일 " + hours + "시간 " + mins + "분 " + scnds + "초 입니다.");
	}
}
