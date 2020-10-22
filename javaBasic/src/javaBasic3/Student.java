package javaBasic3;

public class Student {
	 
	public int id;
	public String name;
	public String address;
	
	public Student() {}	// 디폴트 생성자를 써주면, 밑의 id, name 인자를 안줘도 오류가 안남
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		address = "주소없음";
	}
	
	public void showStudentInfo() {
		System.out.println(name + "," + address);
	}
	
	public String getStudentName() {
		return name;
	}
	
	
}
