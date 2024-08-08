package kr.or.ddit.homework;



public class HomeWork10 {
	public static void main(String[] args) {
//		Student[] score = new Student[5];
		// 1 클래스 완성
		
		// 2 클레스 데이터 입력
		Student st1 = new Student();
		st1.name = "철수";
		st1.kor = 20;
		st1.eng = 10;
		st1.math = 100;
		
		
		Student st2 = new Student();
		st2.name = "영희";
		st2.kor = 0;
		st2.eng = 90;
		st2.math = 20;
		
		Student st3 = new Student();
		st3.name = "맹구";
		st3.kor = 30;
		st3.eng = 100;
		st3.math = 80;
		
		Student st4 = new Student();
		st4.name = "영구";
		st4.kor = 70;
		st4.eng = 20;
		st4.math = 100;	
		
		Student st5 = new Student();
		st5.name = "소라";
		st5.kor = 100;
		st5.eng = 20;
		st5.math = 60;
				

		
		// 등수
		// 3 클래스를 클래스 배열에 담기
		Student[] score = {st1, st2, st3, st4, st5};
//		for(Student s : score) {
//			// 평균 총 합 구하기;
//			s.sum = s.kor + s.eng + s.math;
//			s.avg = s.sum/3.0;
//		}
		for(int i = 0; i <score.length; i++) {
			// 총합 구하기
			Student student = score[i];
			student.sum = student.kor + student.eng + student.math;
			student.avg = student.sum/3.0;
		}
	
		for(int i = 0; i<score.length; i++) {
			Student student = score[i];
			for(int j = 0; j<score.length; j++) {
				if(score[i].sum < score[j].sum) {
					score[i].rank++;
					
				}
				
			}
			
			
//			System.out.println("이름 : " + student.name + "\n" + "총점: " + student.sum +"\n"+ "평균 : " + student.avg+"\n" + "등수 : " +(student.rank));
		}
//		for(Student s : score) {
//		// 평균 총 합 구하기;
//		s.sum = s.kor + s.eng + s.math;
//		s.avg = s.sum/3.0;
//	}
		for(int i = 0; i<score.length-1; i++) {
			
			for(int j = 0; j<score.length-1; j++) {
				Student student = score[i];
				if(score[j].rank >score[j+1].rank) {
					int temp = score[j].rank;
					score[j].rank = score[j+1].rank;
					score[j+1].rank = temp;
				}
			}
		}for(int i = 0; i<score.length; i++) {
			System.out.println(score[i]+"\t");	
		}
		
		for(int i = 0; i<score.length; i++) {
			for (int j = 0; j>score.length; j++) {
				if(score[i].sum<score[j+1].sum) {
					score[i].rank++;
				}
			}
		}
		for(int i =0; i<score.length-1; i++) {
			for(int j=  0; j<score.length-1; i++) {
				if(score[j].sum < score[j+1].sum) {
					Student st = score[j];
					score[j] = score[j+1];
					score[j+1] = st;
				}
			}
		}
	}
}

class Student {
	// 이름, 국, 영, 수, 총점, 평균, 등수 =>정렬
	String name;
	int kor;
	int eng;
	int math;
	
	int sum;
	double avg;
	int rank = 1;
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg="
				+ avg + ", rank=" + rank + "]";
	}
	
}