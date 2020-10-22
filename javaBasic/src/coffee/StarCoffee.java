package coffee;

public class StarCoffee {

	int money;
	
	public String buying(int money) {
		this.money += money;
		if(money == Menu.STARAMERICANO) {
			return "스타벅스 아메리카노를 주문했습니다.";
		}
		
		else if(money == Menu.STARLATTE) {
			return "스타벅스 라떼를 주문했습니다.";
		}
		
		else if(money == Menu.STARTEA) {
			return "스타벅스 티를 주문했습니다.";
		}
		
		else {
			return null;
		}
		
		
	}
	
}
