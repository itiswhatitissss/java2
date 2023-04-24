package ex03;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("1~4학년입력");
		int grade = sc.nextInt(); //--> 정수
		//char ch = 'A' --> 문자
		//String str = "abc" --> 문자열
		
		switch(grade) {    //switch문에는 정수랑 문자열만 올 수 있음
		case 1 : //case = 'A' : --> 이거도 가능 ~ 정수, 문자열, 문자 !!
			System.out.println("1학년");
			break;
		case 2 :
			System.out.println("2학년");
			break;
		case 3 :
			System.out.println("3학년");
			break;
		case 4 :
			System.out.println("4학년");
			break;
		default :
			System.out.println("다른숫자입력 ㄴㄴ");
			}
		System.out.println("끄읕");
	}

}
