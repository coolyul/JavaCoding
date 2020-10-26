package cooperation;

public class Student {

	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= money;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= money;
	}
	
	public void showInfo() {		// 잔액 얼마 남았는지 
		System.out.println(studentName + "님의 잔액은 " + money + "원 입니다.");
	}
}
 