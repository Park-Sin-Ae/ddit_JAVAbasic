package kr.or.ddit.homework.home12;

public class Student {
	String dprtm;
	int stdntId;
	public Student(String dprtm, int stdntId) {
		this.dprtm = dprtm;
		this.stdntId = stdntId;
	}
	@Override
	public String toString() {
		return "Student [dprtm=" + dprtm + ", stdntId=" + stdntId + "]";
	}
}
