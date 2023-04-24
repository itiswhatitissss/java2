package ex03;

import java.util.*;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("숫자를 입력해주세요");
		int num = sc.nextInt();
		
		if(num>0)
			System.out.println("양수");
		else if(num<0)
			System.out.println("음수");
		else if(num==0)
			System.out.println("zero");
		
		
	}

}
