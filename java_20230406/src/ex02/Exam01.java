package ex02;

import java.util.*;

public class Exam01 {
	public static void main(String[] args) {
		

		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(str);
		
		System.out.println("국어");
		int kor = sc.nextInt();
		System.out.println("영어");
		int eng = sc.nextInt();
		System.out.println("수학");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;

		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (kor + eng + math)/3.0);
		
		
		
		
		
	}

}
