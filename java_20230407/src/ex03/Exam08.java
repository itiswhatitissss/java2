package ex03;

import java.util.*;

public class Exam08 {

	public static void main(String[] args) {
		
		int bot = (int)(Math.random()*3)+1;
		System.out.println("1가위,2바위,3보");
		
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		
		switch(user-bot) {
		case 0 :
			System.out.println("무승부");
			break;
		case -2 :case 1 : 
			System.out.println("승");
			break;
		case -1 :case 2 :
			System.out.println("패");
			break;
		
			
		}
		System.out.println("나 : " + user + " ,bot : " + bot);
		
	}
}
