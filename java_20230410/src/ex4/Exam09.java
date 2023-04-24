package ex4;

import java.util.*;

public class Exam09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		int balance=0;
		
		for(;flag;) {
			System.out.println("1(예금),2(출금),3(잔고),4(종료)");
			
			int number = sc.nextInt();
			switch(number) {
			case 1:
				System.out.println("예금액>");
				balance += sc.nextInt();
				break;
			case 2:
				System.out.println("출금액>");
				balance -= sc.nextInt();
				break;
			case 3:
				System.out.println("잔고>");
				System.out.println("잔고 : "+ balance);
				break;
			case 4:
				System.out.println("프로그램종료");
				flag=false;
				break;
			
			}
		}
		
		
	}
}
