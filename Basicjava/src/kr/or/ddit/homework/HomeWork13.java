package kr.or.ddit.homework;

public class HomeWork13 {
	public static void main(String[] args) {
		// 과제 10을 메소드로 바꿔서 구현
		// 1. dataInput();
		// 클래스에 데이터 입력 및 클래스를 클래스 배열에 담기.
		// 2. 평균과, 총점을 구하는 메소드
		// 3. 랭크를 구하는 메소드
		// 4. 정렬하는 메소드
		// 5. 출력하는 메소드
		HomeWork13 hw = new HomeWork13();
		Student[] students = hw.dataInput();

		students = hw.sum(students);
		students = hw.avg(students);
		students = hw.rank(students);
		students = hw.sort(students);
		hw.printStudent(students);
		
		

	}
	
	public void printStudent(Student[] stu) {
		for(Student student : stu) {
			System.out.println(student);
		}
	}
	
	public Student[] dataInput() {
		Student[] students = new Student[5];
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
		
		Student[] score = {st1, st2, st3, st4, st5};
		return score;
	}
		
	
	// 총합 메소드
	public Student[] sum(Student[] stu) {
		for(Student s : stu) {
		// 평균 총 합 구하기;
		s.sum = s.kor + s.eng + s.math;

		} return stu;
	}
	
	//평균 메소드
	public Student[] avg(Student[] stu) {
		for(int i = 0; i <stu.length; i++) {
			Student student = stu[i];

			student.avg = student.sum/3.0;
		}return stu;
	}
	
	//등수 메소드
	public Student[] rank(Student[] stu) {
		for(int i = 0; i<stu.length; i++) {
//			Student student = stu[i];
			for(int j = 0; j<stu.length; j++) {
				if(stu[i].sum < stu[j].sum) {
					stu[i].rank++;
					
				}
				
			}
			
		}return stu;
	}
	//정렬 메소드
	public Student[] sort(Student[] stu) {
		for(int i = 0; i<stu.length-1; i++) {
			for(int j = 0; j<stu.length-1; j++) {
				if(stu[j].sum < stu[j+1].sum) {
					Student temp = stu[j];
					stu[j] = stu[j+1];
					stu[j+1] = temp;
				}
			}
		}return stu;
	}
}
