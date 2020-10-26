package hiding;

public class MyDate {
	
	// public 을 안쓰면 같은 패키지 안에서만 쓸 수 있다. 
	// public 을 써주면 다른 패키지에서도 쓸 수 있음.
	
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;
	
	
	// day 게터세터 
	public void setDay(int day) {
		this.day = day;
	}
	public int getDay() {
		return day;
	}
	
	
	// month 게터세터 
	public void setMonth(int month) {
		
		
			this.month = month;
		
	}
	public int getMonth() {
		return month;
	}
	
	
	// year 게터세터
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
		
	}
	
	 
	// 날짜 출력
	public void showDate() {
		if(isValid) {
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다");
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
}
