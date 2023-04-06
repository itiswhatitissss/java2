package ex02;

import java.util.*;

public class Exam07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("최대값");
		{if (a > b && a > c)
			System.out.println(a);
		if (b > a && b > c)
			System.out.println(b);
		if (c > a && c > b)
			System.out.println(c);}
		
		System.out.println("최소값");
		{if (a < b && a < c)
			System.out.println(a);
		if (b < a && b < c)
			System.out.println(b);
		if (c < a && c < b)
			System.out.println(c);}
}
}