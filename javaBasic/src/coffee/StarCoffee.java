package coffee;

public class StarCoffee {

	int money;
	
	public String buying(int money) {
		this.money += money;
		if(money == Menu.STARAMERICANO) {
			return "��Ÿ���� �Ƹ޸�ī�븦 �ֹ��߽��ϴ�.";
		}
		
		else if(money == Menu.STARLATTE) {
			return "��Ÿ���� �󶼸� �ֹ��߽��ϴ�.";
		}
		
		else if(money == Menu.STARTEA) {
			return "��Ÿ���� Ƽ�� �ֹ��߽��ϴ�.";
		}
		
		else {
			return null;
		}
		
		
	}
	
}
