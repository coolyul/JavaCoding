package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student seo = new Student("Seo", 5000);
		Student lee = new Student("Lee", 10000);
		
		Bus bus100 = new Bus(100);
		Bus bus751 = new Bus(751);
		Subway subwayGreen = new Subway(2);
		Subway subwayBlue = new Subway(4);
		
		seo.takeBus(bus100);
		lee.takeSubway(subwayGreen);
		
		seo.showInfo();
		lee.showInfo();
		
		bus100.showBusInfo();
		bus751.showBusInfo();
		
		subwayGreen.showSubwayInfo();
		subwayBlue.showSubwayInfo();
		

	}

}
