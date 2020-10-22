package javaBasic4;

public class MyDate {
	
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;

	public MyDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
		
	}
	
	

	public int getDay() {
		return day;
	}



	public void setDay(int day) {
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			
				if(day<1 || day>31) {
					isValid = false;
					
				}
				else {
					this.day = day;
				}
				
			
		}
	}



	public int getMonth() {
		return month;
	}



	public void setMonth(int month) {
		this.month = month;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public boolean isValid() {
		
		if(isValid==true) {
			System.out.println("��ȿ�� ��¥�Դϴ�.");
			
		}
		else {
			System.out.println("��ȿ���� ���� ��¥�Դϴ�");
			
		}
		
		return isValid();
		
	}

}
