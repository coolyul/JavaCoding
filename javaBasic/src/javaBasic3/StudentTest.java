package javaBasic3;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentSeo = new Student(); // �⺻  ������
		studentSeo.name = "������";
		studentSeo.address = "����";
		
		studentSeo.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.name = "������";
		studentKim.address = "����";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentSeo);
		System.out.println(studentKim);
	}

}
