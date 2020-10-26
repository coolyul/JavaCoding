package staticex;

public class Company {
	
	/* 1. Ŭ������ ������ private �����ڸ� �ϳ� ������ش�! �ܺο��� ȣ��Ұ�(�ϳ��� ������ ������ ����Ʈ�� �����ڰ� �����Ǳ� ������ ������ new �ϸ� ������ ��������������) 
	 * 2. static���� ������ �ν��Ͻ� (��ü)�� ���������� new�� �ϳ� �����صд�. �ϳ��� ������ �־���ϹǷ�
	 * 3. �� ������ ��ü�� �ܺο��� �� ���� ������̴�.
	 * 4. �׷� �� private ��ü�� �ܺο��� �� �� �ֵ��� public getInstance �޼��带 ������ش�
	 * */

	private static Company instance = new Company();
	
	private Company() {}	// 1. private���� �����ڸ� �ϴ� ���� ������ֱ�. �̷� �⺻ �����ڷ� �ν��ϰ� ��. �ٵ� �ܺο� ���µǴ� �����ڴ� �ƴ�.
	
	public static Company getInstance() {		// private instance�� �ܺο��� ���� ���� public �޼��� �ϳ� ������ֱ�.
												// �Ϲ� �޼��尡 �ƴ϶� static �޼���� ���� �ܺο��� instance �ȸ��� �� �� �ֵ��� �ϱ����ؼ�.
		
		if(instance == null) {
			instance = new Company();
		}
		return instance;		// (��ü�� �������ִ� ��! ��ü �̸��� instance�� �����ϱ�)
		
	}
}
