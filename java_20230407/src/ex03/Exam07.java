package ex03;

import java.util.*;

public class Exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~4입력하소");
		int grade = sc.nextInt();
		
		switch(grade) {
		case 1 :
			System.out.println("1학년");
			break;
		case 2 :
			System.out.println("2학년");
			break;
		case 3 :
			System.out.println("3학년");
			break;
		case 4 :
			System.out.println("4학년");
			break;
		default :
			System.out.println("1~4만여");
			
	}
	}
}
