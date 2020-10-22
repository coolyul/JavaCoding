package javaBasic2;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rank = sc.nextInt();
		char medalColour;
		
		switch(rank) {
		
			case 1 : medalColour = 'G';
			System.out.println("금메달");
			break;
			
			case 2 : medalColour = 'S';
			System.out.println("은메달");
			break;
			
			case 3 : medalColour = 'B';
			System.out.println("동메달");
			break;
			
			default : medalColour = 'A';
		}

		System.out.println(rank + "등은 " + medalColour + "메달 입니다");
	}

}
