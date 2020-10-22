package coffee;

public class BeanCoffee {

	int money;
	
	public String buying(int money) {
		this.money += money;
		
		if(money == Menu.BEANAMERICANO) {
			return "커피빈 아메리카노를 주문했습니다.";
		}
		
		else if(money == Menu.BEANLATTE) {
			return "커피빈 라떼를 주문했습니다.";
			
		}
		
		else if(money == Menu.BEANTEA) {
			return "커피빈 티를 주문했습니다.";
		}
		
		else {
			return null;
		}
	}
}
