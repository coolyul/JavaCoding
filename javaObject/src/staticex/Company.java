package staticex;

public class Company {
	
	/* 1. 클래스가 있으면 private 생성자를 하나 만들어준다! 외부에서 호출불가(하나도 만들지 않으면 디폴트로 생성자가 생성되기 때문에 누구나 new 하면 생성자 만들어버릴수있음) 
	 * 2. static으로 유일한 인스턴스 (객체)를 내부적으로 new로 하나 생성해둔다. 하나는 무조건 있어야하므로
	 * 3. 이 유일한 객체를 외부에서 쓸 일이 생길것이다.
	 * 4. 그럼 그 private 객체를 외부에서 쓸 수 있도록 public getInstance 메서드를 만들어준다
	 * */

	private static Company instance = new Company();
	
	private Company() {}	// 1. private으로 생성자를 일단 먼저 만들어주기. 이럼 기본 생성자로 인식하게 됨. 근데 외부에 오픈되는 생성자는 아님.
	
	public static Company getInstance() {		// private instance를 외부에서 쓰기 위해 public 메서드 하나 만들어주기.
												// 일반 메서드가 아니라 static 메서드로 만들어서 외부에서 instance 안만들어도 쓸 수 있도록 하기위해서.
		
		if(instance == null) {
			instance = new Company();
		}
		return instance;		// (객체를 리턴해주는 것! 객체 이름을 instance로 했으니까)
		
	}
}
