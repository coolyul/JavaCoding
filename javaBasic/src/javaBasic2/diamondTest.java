package javaBasic2;

public class diamondTest {

	public static void main(String[] args) {
		
		
		
		// 다이아몬드 상단부
		
		for(int i=0; i<4; i++) {
			
			for(int j=0; j<3-i; j++) {
				System.out.print(" ");
			}	
			
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
			}

	
			System.out.println();
		}
		 
			
		// 다이아몬드 하단부
		
		for(int i=4; i<7; i++) {
			for(int j=0; j<i-3; j++) {
				System.out.print(" ");
			}
			
			for(int j=7; j<2*i-j; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		

	}

}
