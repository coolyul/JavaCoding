package javaBasic4;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentSeo = new Student(100, "Seo");
		studentSeo.setKoreanSubject("����", 100);
		studentSeo.setMathSubject("����", 95);
		
		Student studentLee = new Student(101, "Kim");
		studentLee.setKoreanSubject("����", 95);
		studentLee.setMathSubject("����", 98);
		
		studentSeo.showStudentScore();
		studentLee.showStudentScore();
	}

}
