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
			System.out.println(name + "님이 " + money + "원 짜리 " + message + "\n" + name +  "님의 잔액은 " + balance + "원 입니다.");
		}
		
	}
	
	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.buying(money);
		if(message != null) {
			balance -= money;
			System.out.println(name + "님이 " + money + "원 짜리 " + message + "\n" + name +  "님의 잔액은 " + balance +"원 입니다.");
		}
		
	}
}
