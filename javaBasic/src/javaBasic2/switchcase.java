package javaBasic2;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rank = sc.nextInt();
		char medalColour;
		
		switch(rank) {
		
			case 1 : medalColour = 'G';
			System.out.println("�ݸ޴�");
			break;
			
			case 2 : medalColour = 'S';
			System.out.println("���޴�");
			break;
			
			case 3 : medalColour = 'B';
			System.out.println("���޴�");
			break;
			
			default : medalColour = 'A';
		}

		System.out.println(rank + "���� " + medalColour + "�޴� �Դϴ�");
	}

}
