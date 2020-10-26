package javaBasic4;

public class Student {
	
	int studentID;
	String studentName;
	
	Subject kor;
	Subject math;
	
	public Student(int id, String name) {
		kor = new Subject();
		math = new Subject();
		
		this.studentName = name;
	}
	
	public void setKoreanSubject(String subjectName, int score) {
		kor.subjectName = subjectName;
		kor.score = score;
	}
	
	public void setMathSubject(String subjectName, int score) {
		math.subjectName = subjectName;
		math.score = score;
	}
	
	public void showStudentScore() {
		int sum = kor.score + math.score;
		System.out.println(this.studentName + "학생의 총점은 " + sum + "점 입니다.");
				
	}
	
}
