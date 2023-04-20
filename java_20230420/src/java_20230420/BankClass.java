package java_20230420;

import java.util.*;

class Account {
	String accnum;//계좌번호
	String accname;//계좌주
	int deposit;//입금액
}

class Bankapp {
	final int NUM=100;
	Account[] ac = new Account[NUM];
}
public class BankClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		boolean flag = true;
		String n=null;
		int count = 0;
		
		Bankapp ba = new Bankapp();
		
		for(int i=0;i<ba.ac.length;i++)
			ba.ac[i]=new Account();
		
		while(flag) {
			System.out.println("------------------------------------");
			System.out.println("1.계좌생성, 2.계좌목록 3. 예금 4.출금 5.종료");
			System.out.println("------------------------------------");
			System.out.println(">선택");
			
			n = sc.nextLine();
			
			switch(n) {
			case "1" : 
				System.out.println("----------");
				System.out.println("1.계좌생성");
				System.out.println("----------");
				System.out.println();
				System.out.println("계좌번호 입력");
				ba.ac[count].accnum = sc.nextLine();
				System.out.println("계좌 이름 입력");
				ba.ac[count].accname = sc.nextLine();
				System.out.println("초기입금액");
				ba.ac[count].deposit += sc.nextInt();
				count++;
				break;
				
			case "2" :
				System.out.println("----------");
				System.out.println("2.계좌목록");
				System.out.println("----------");
				System.out.println();
				
				
				for(int i=0;i<count;i++)
					System.out.println("계좌번호 : "+ba.ac[i].accnum+"계좌주 : "+ba.ac[i].accname+"잔고 : "+ba.ac[i].deposit);
				break;
				
			case "3" :
				System.out.println("----------");
				System.out.println("3.예금");
				System.out.println("----------");
				System.out.println();
				System.out.println("예금하고자 하는 계좌번호를 입력해주세요");
				String accnum1 = sc.nextLine();
				System.out.println("예금액 입력");
				int in = sc.nextInt();
				for(int i=0;i<count;i++) {
					if(ba.ac[i].accnum.equals(accnum1))
						ba.ac[i].deposit+=in;
				}
				break;
				
			case "4" :
				System.out.println("----------");
				System.out.println("4.출금");
				System.out.println("----------");
				System.out.println();
				System.out.println("출금하고자 하는 계좌번호를 입력해주세요");
				String accnum2 = sc.nextLine();
				System.out.println("출금액 입력");
				int out = sc.nextInt();
				for(int i=0;i<count;i++) {
					if(ba.ac[i].accnum.equals(accnum2))
						ba.ac[i].deposit-=out;
				}
				break;
			
				
			case "5" :
				System.out.println("프로그램 종료");
				flag = false;
				
						
						
			}
			
			
		}
		
		

	}

}
