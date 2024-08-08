package kr.or.ddit.study05;

public class EnumTest {
	public static void main(String[] args) {
		EnumTest e = new EnumTest();
		e.weekDay("FRI");
		e.weekDay(Week.MON);
		
		for(Week w : Week.values()) {
			System.out.println(w.s);
		}
	}
	
	public void weekDay(Week day) {
//		if(day == Week.FRI) {
//			System.out.println("금요일입니다.");
//		}
		System.out.println(day.s + "입니다.");
	}
	
	//같은 이름의 메서드를 만들 수 있는 것(이너타입)
	
	public void weekDay(String day) {
		if(day.equals("fri")) {
			System.out.println("금요일입니다.");
		}
	}
}
