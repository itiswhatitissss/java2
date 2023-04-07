package ex03;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("계절입력");
		String season = sc.nextLine();
		
		switch(season) {    //switch문에는 정수랑 문자열만 올 수 있음
		case "spring" :
			System.out.println("봄");
			break;
		case "summer" :
			System.out.println("여름");
			break;
		case "fall" :
			System.out.println("가을");
			break;
		case "winter" :
			System.out.println("겨울");
			break;
		default :
			System.out.println("아직도");
			}
		System.out.println("끄읕");
	}

}
