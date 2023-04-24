package ex03;

import java.util.*;

public class Exam09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		switch(score/10) {
		case 10: case 9:
			System.out.println("A");
			break;
		
		case 8:
			System.out.println("B");
			break;
			
		case 7:
			System.out.println("C");
			break;
			
		case 6:
			System.out.println("D");
			break;
			
		case 1: case 2: case 3: case 4: case 5:
			System.out.println("F");
			break;
			
		default:
			System.out.println("ㄴㄴ");
		}
		
	}
}
