package javaBasic1;
import java.util.*;

public class Ifexample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		int charge = 0;
		
		if(age < 8) {
			charge = 1000;
		
		} else if(age <14) {
			charge = 1500;
			
		} else if(age <20) {
			charge = 2000;
			
		} else {
			charge = 3000;
			
		}
		System.out.println("���� : " + age);
		System.out.println("��� : " + charge);
		

	}

}
