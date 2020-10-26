package cooperation;

public class Bus {
	
	int busNumber;
	int passengerCount;
	int money;								// 버스 수익
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {			// 승객 태우는 메서드
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명이고, 수익은 " + money + "입니다");
	}
	
	

}
