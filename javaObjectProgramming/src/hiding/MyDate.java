package hiding;

public class MyDate {
	
	// public �� �Ⱦ��� ���� ��Ű�� �ȿ����� �� �� �ִ�. 
	// public �� ���ָ� �ٸ� ��Ű�������� �� �� ����.
	
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;
	
	
	// day ���ͼ��� 
	public void setDay(int day) {
		this.day = day;
	}
	public int getDay() {
		return day;
	}
	
	
	// month ���ͼ��� 
	public void setMonth(int month) {
		
		
			this.month = month;
		
	}
	public int getMonth() {
		return month;
	}
	
	
	// year ���ͼ���
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
		
	}
	
	 
	// ��¥ ���
	public void showDate() {
		if(isValid) {
			System.out.println(year + "�� " + month + "�� " + day + "�� �Դϴ�");
		}
		else {
			System.out.println("��ȿ���� ���� ��¥�Դϴ�.");
		}
	}
}
