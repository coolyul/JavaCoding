package coffee;

public class BeanCoffee {

	int money;
	
	public String buying(int money) {
		this.money += money;
		
		if(money == Menu.BEANAMERICANO) {
			return "Ŀ�Ǻ� �Ƹ޸�ī�븦 �ֹ��߽��ϴ�.";
		}
		
		else if(money == Menu.BEANLATTE) {
			return "Ŀ�Ǻ� �󶼸� �ֹ��߽��ϴ�.";
			
		}
		
		else if(money == Menu.BEANTEA) {
			return "Ŀ�Ǻ� Ƽ�� �ֹ��߽��ϴ�.";
		}
		
		else {
			return null;
		}
	}
}
