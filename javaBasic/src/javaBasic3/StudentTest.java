package javaBasic3;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentSeo = new Student(); // 기본  생성자
		studentSeo.name = "서유리";
		studentSeo.address = "서울";
		
		studentSeo.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.name = "김유신";
		studentKim.address = "경주";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentSeo);
		System.out.println(studentKim);
	}

}
