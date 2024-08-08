package kr.or.ddit.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeWork20 {
	public static void main(String[] args) {
		HomeWork20 obj = new HomeWork20();
		obj.process();
	}
	
	public void process() {
		List<Map> parkList = dataInput();
		String carNum = "5961";
		// 입력한 차량 주차 시간 계산
		int totalParkingTime = getMin(parkList, carNum);
		System.out.println("차량번호 : " + carNum + ", 주차시간 : " + totalParkingTime + "분");
		// 입력한 차량 주차 요금 계산
		int parkingFee = pay(totalParkingTime);
		System.out.println("차량번호 : " + carNum + ", 주차시간 : " + parkingFee + "원");
	}
	
	public int pay(int min) {	// 입력한 차량 주차 요금 계산
		/*
		 * 	기본시간		기본요금		단위시간		단위요금
		 * 	60분			2000원		10분			300원
		 * 
		 * 
		 * 	ex) 73분 60+13
		 * 		기본요금 2000 + 600 -> 2600원 리턴
		 */
		int basicTime = 60;
		int basicFee = 2000;
		int unitTime = 10;
		int unitFee = 300;
		
		int totalFee = 0;
		
		if(min <= basicTime) {
			totalFee = basicFee;
			
		}else {
			int additionalTime = min - basicTime; // 추가시간
			totalFee = basicFee + (additionalTime / unitTime) * unitFee;
			
			// 추가 시간이 남았을 경우 단위 시간으로 나눈 나머지에 대한 추가 단위 요금을 계산
			if(additionalTime % unitTime > 0) {
				totalFee += unitFee;
			}
		}
		
//		if(min < 60) return 2000;
//		else {
//			//	11 + 9 -20/10 = 2
//			//	19		  /10 = 1
//			return 2000 + (min - 60 + 9)/10 * 300;
//		}
		
		return totalFee;
	}
	
	public int getMin(List<Map> parkList, String carNum) { // 입력한 차량 주차 시간 계산
		/*
		 * 
		 */
		int totalParkingTime = 0;
		for(int i = 0; i < parkList.size(); i++) {
			Map map = parkList.get(i);
			String number = (String)map.get("차량번호");
			String time = (String)map.get("시각");
			String inout = (String)map.get("내역");
			
			if(carNum.equals(number)) {
//				continue;
				int currentTime = getTime(time);
				totalParkingTime += currentTime;
			}
		}
		return totalParkingTime;
		
//		int sum = 0;
//		int temp = 0;
//		for(int i = 0; i<parkList.size(); i++) {
//			Map<String, String> map = parkList.get(i);
//			String time = (String) map.get("시각");
//			String number = (String) map.get("차량번호");
//			String inout = (String) map.get("내역");
//		}
	}
	
	public int getTime(String time) {
//		05:34 	-> 05 34
//		hour	<- 05
//		mins	<- 34
		// 334
//		07:59 	-> 07 59
//		hour	<- 07
//		mins	<- 59
		// 479
		// 479 - 334 -> 사용시간 구하기
		
		int hour = Integer.parseInt(time.split(":")[0]);
		int mins = Integer.parseInt(time.split(":")[1]);
		return hour*60+mins;
	}
	
	private List<Map> dataInput() {
		/*
		 * 시간	 	차량번호		내역
		 * 05:34	 5961		입차 1
		 * 06:00	 0000		입차 2
		 * 06:34	 0000		출차 3
		 * 07:59	 5961		출차 4
		 * 07:59	 0148		입차 5
		 * 18:59	 0000		입차 6
		 * 12:09	 0148		출차 7 
		 * 22:59	 5961		입차 8
		 * 23:00	 5961		출차 9
		 * 23:00	 0000		출차 10
		 */
		
		
		
		Map m1 = new HashMap();
		m1.put("시각", "05:34");
		m1.put("차량번호", "5961");
		m1.put("내역", "입차");
		
		Map m2 = new HashMap();
		m2.put("시각", "06:00");
		m2.put("차량번호", "0000");
		m2.put("내역", "입차");
		
		Map m3 = new HashMap();
		m3.put("시각", "06:34");
		m3.put("차량번호", "0000");
		m3.put("내역", "출차");
		
		Map m4 = new HashMap();
		m4.put("시각", "07:59");
		m4.put("차량번호", "5961");
		m4.put("내역", "출차");
		
		Map m5 = new HashMap();
		m5.put("시각", "07:594");
		m5.put("차량번호", "0148");
		m5.put("내역", "입차");
		
		Map m6 = new HashMap();
		m6.put("시각", "18:59");
		m6.put("차량번호", "0000");
		m6.put("내역", "입차");
		
		Map m7 = new HashMap();
		m7.put("시각", "12:09");
		m7.put("차량번호", "0148");
		m7.put("내역", "출차");
		
		Map m8 = new HashMap();
		m8.put("시각", "22:59");
		m8.put("차량번호", "5961");
		m8.put("내역", "입차");
		
		Map m9 = new HashMap();
		m9.put("시각", "23:00");
		m9.put("차량번호", "5961");
		m9.put("내역", "출차");
		
		Map m10 = new HashMap();
		m10.put("시각", "23:00");
		m10.put("차량번호", "0000");
		m10.put("내역", "출차");
		
		List<Map> parkList = new ArrayList();
		parkList.add(m1);
		parkList.add(m2);
		parkList.add(m3);
		parkList.add(m4);
		parkList.add(m5);
		parkList.add(m6);
		parkList.add(m7);
		parkList.add(m8);
		parkList.add(m9);
		parkList.add(m10);
		
		return parkList;
	}
}
