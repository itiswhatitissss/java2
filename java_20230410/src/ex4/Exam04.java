package ex4;

import java.util.*;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시작 정수 입력");
		int num1 = sc.nextInt();
		System.out.println("끝 정수 입력");
		int num2 = sc.nextInt();
		
		int total = 0;
		
		for(int i=num1; i<=num2; i++) 
			total += i;
		System.out.println("시작 정수 부터 끝 정수까지의 합 : " + total);
		
	
	}

}
