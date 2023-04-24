package ex02;

import java.util.*;

public class Exam07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("최대값");
		if (a > b && a > c)
			System.out.println(a);
		if (b > a && b > c)
			System.out.println(b);
		if (c > a && c > b)
			System.out.println(c);
		
		System.out.println("최소값");
		if (a < b && a < c)
			System.out.println(a);
		if (b < a && b < c)
			System.out.println(b);
		if (c < a && c < b)
			System.out.println(c);
		
		
		//-----------------------------------------------//
		int num1, num2, num3;
		int max, min;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		//최대값
		if(num1>num2) {
			if(num1>num3) max = num1;
			else max = num3;
		}else {
			if(num2>num3) max = num2;
			else max = num3;
		}
		
		//최소값
		if(num1>num2) {
			if (num2>num3) min = num3;
			else min = num2;
		}else {
			if(num1>num3) min = num3;
			else min = num1;
		}
	}
}
