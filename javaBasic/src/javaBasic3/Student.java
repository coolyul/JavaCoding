package javaBasic3;

public class Student {
	 
	public int id;
	public String name;
	public String address;
	
	public Student() {}	// ����Ʈ �����ڸ� ���ָ�, ���� id, name ���ڸ� ���൵ ������ �ȳ�
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		address = "�ּҾ���";
	}
	
	public void showStudentInfo() {
		System.out.println(name + "," + address);
	}
	
	public String getStudentName() {
		return name;
	}
	
	
}
