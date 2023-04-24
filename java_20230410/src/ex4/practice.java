package ex4;

//예금 출금 잔고 종료 은행 시스템 만들기
import java.util.*;

public class practice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int budget = 0;
		
		for(;flag;) {
			System.out.println("1(예금),2(출금),3(잔고),4(종료)");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("예금");
				int plus = sc.nextInt();
				budget += plus;
				break;
			case 2: 
				System.out.println("예금");
				int minus = sc.nextInt();
				budget -= minus;
				break;
			case 3: 
				System.out.println("예금");
				System.out.println("현재잔고"+budget);
				break;
			case 4:
				System.out.println("프로그램 종료");
				flag = false;}
		}
				
	}

}
