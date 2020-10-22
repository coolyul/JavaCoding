package coffee;

public class Person {
	
	String name;
	int money;
	int balance;
	
	public Person(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public void  buyStarCoffee(StarCoffee sCoffee, int money) {
		String message = sCoffee.buying(money);
		if(message != null) {
			balance -= money;
			System.out.println(name + "���� " + money + "�� ¥�� " + message + "\n" + name +  "���� �ܾ��� " + balance + "�� �Դϴ�.");
		}
		
	}
	
	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.buying(money);
		if(message != null) {
			balance -= money;
			System.out.println(name + "���� " + money + "�� ¥�� " + message + "\n" + name +  "���� �ܾ��� " + balance +"�� �Դϴ�.");
		}
		
	}
}
