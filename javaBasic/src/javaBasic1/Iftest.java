package javaBasic1;
import java.util.*;

public class Iftest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		String grade = "";
		
		if(score <= 59) {
			grade = "F";
			
		} else if(score <= 69) {
			grade = "D";
			
		} else if(score <= 79) {
			grade = "C";
			
		} else if(score <= 89) {
			grade = "B";
			
		} else if(score <= 100) {
			grade = "A";
			
		}
		
		System.out.println("ÇÐÁ¡ : " + grade);
	}

}
