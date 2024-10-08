package kr.or.ddit.homework.home18;

import java.util.Scanner;

public class HomeWork18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Schedular s = null;
//		s.getNextCall();
//		s.sendCallToAgent();
	
		System.out.println("전화 상담의 분배 방식 선택");
		System.out.println("R : RoundRobn");
		System.out.println("L : LeastJob");
		System.out.println("P : PriorityAllocation");
		System.out.println("선택 >>");
		
		String inpt = sc.next().toUpperCase();
		
		/*
		 * 스캐너를 통해서 R, L, P 에 따라서 분배 방식 변경.
		 * 
		 * 각 클래스를 만들어 볼 것.
		 * 
		 * Schedular 클래스를 각각 상속 받을것.
		 * getNextCall()
		 * sendCallToAgent()
		 * ---------------------------------
		 * 1. RoundRobn
		 * 	  getNextCall
		 * 	  -> 상담 전화를 대기열에서 차례대로 가져옴
		 * 	  sendCallToAgent
		R *   -> 차례대로 상담원에게 상담전화를 분배.
		 * 2. LeastJJob
		 * 	  getNextCall
		 * 	  -> 상담 전화를 대기열에서 차례대로 가져옴
		 * 	  sendCallToAgent
		 * 	  -> 대기열이 가장 짧은 상담원에게 상담전화를 분배.
		 * 3. PriorityAllocation
		 * 	  getNextCall
		 * 	  -> 우선 순위가 높은 상담전화를 대기열에서 가져옴
		 * 	  sendCallToAgent
		 * 	  -> 업무 스킬이 가장 우수한 상담원에게 상담전화 분배.
		 */
		
		if(inpt.equals("R")) s = new RoundRobn();
		if(inpt.equals("L")) s = new LeastJob();
		if(inpt.equals("P")) s = new PriorityAllocation();
		
		s.getNextCall();
		s.sendCallToAgent();
	
	}
}
