package coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Person seo = new Person("Seo", 10000);
		Person byun = new Person("Byun", 10000);
		Person lee = new Person("Lee", 10000);
		
		
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		seo.buyStarCoffee(starCoffee, Menu.STARLATTE);
		byun.buyStarCoffee(starCoffee, Menu.STARTEA);
		lee.buyBeanCoffee(beanCoffee, Menu.BEANAMERICANO);
		seo.buyBeanCoffee(beanCoffee, 4800);
		
	}
}
