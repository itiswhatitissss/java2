package ex03;

import java.util.*;

public class Exam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력하셔요");
		int score = sc.nextInt();
		
		if(score>=90)
			System.out.println("A");
		else if(score >= 80)
			System.out.println("B");
		else if(score >= 70)
			System.out.println("C");
		else if(score >= 60)
			System.out.println("D");
		else
			System.out.println("F");
	}

}
