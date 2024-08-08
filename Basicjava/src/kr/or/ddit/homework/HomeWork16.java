package kr.or.ddit.homework;

import java.util.Scanner;

import kr.or.ddit.study06.sec06.Prod;

public class HomeWork16 {
	Scanner sc = new Scanner(System.in);
	
	Member[] memList = new Member[100];
	int cur = 0;
	
	public static void main(String[] args) {
		HomeWork16 obj = new HomeWork16();
		obj.process();
	}
	public void process() {
		//회원 관리 시스템
		while(true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 회원탈퇴"); // 생략
			System.out.println("3. 정보수정");
			System.out.println("4. 회원 전체 정보 출력");
			
			/*
			 * 1, 2, 3, 4 를 각각 입력했을 때 해당하는 메소드 실행하기
			 * 
			 */
			
			int sel = sc.nextInt();
			if(sel == 1) addMember();
			if(sel == 2) delMember();
			if(sel == 3) update();
			if(sel == 4) printList();
		}
	}
	
	public void delMember() {
		printList();
		System.out.println("삭제할 회원 번호 입력 : ");
		int num = sc.nextInt();
		
		for(int i = num; i < cur; i++) {
			memList[i] = memList[i+1];
		}
		cur--;
		printList();
	}
	
	public void addMember() {
		Member mem = new Member();
		
		System.out.println("아이디를 입력하세요");
		mem.setId(sc.next());
		System.out.println("이름를 입력하세요");
		mem.setName(sc.next());
		System.out.println("나이를 입력하세요");
		mem.setAge(sc.nextInt());

		System.out.println(mem.getId() + ", " + mem.getName() + ", " + mem.getAge());
		/*
		 * 정보 입력 getter setter 이용해서 정보입력
		 */
		
		memList[cur++] = mem; //cur(가입한 회원 수)
	}
	
	
	// 4.
	public void printList() {
		System.out.println("회원번호, 이름, 아이디, 나이");
		for(int i = 0; i < cur; i++) {
			Member mem = memList[i];
			/*
			 *  mem 정보 꺼내서 출력
			 */
			System.out.println(i +" 회원 : "+ "아이디 : " + mem.getId() + "이름 :  " + mem.getName() + "나이 : " + mem.getAge());
		}
	}
	
	public void update() {
		printList();
		System.out.print("수정할 회원 번호 입력 : ");
		int num = sc.nextInt();
		Member mem = memList[num];
		
		/*
		 *  정보 수정
		 */
		System.out.println("변경할 아이디를 입력하세요");
		mem.setId(sc.next());
		System.out.println("변경할 이름 입력하세요");
		mem.setName(sc.next());
		System.out.println("변경할 나이를 입력하세요");
		mem.setAge(sc.nextInt());
		printList();
	}
}
/*
 * getter setter 사용해 보기.
 */
class Member {
	private String id;
	private String name;
	private int age;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}




	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
