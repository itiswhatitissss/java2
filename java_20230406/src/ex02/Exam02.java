package ex02;

import java.util.*;

public class Exam02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력");
		String name = sc.nextLine();
		System.out.println("주소를 입력");
		String address = sc.nextLine();
		System.out.println("나이를 입력");
		int age = sc.nextInt();
		
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		System.out.println("나이 : " +(age+1));
		
		
	}

}
