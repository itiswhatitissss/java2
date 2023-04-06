package ex02;

import java.util.*;

public class Exam04 {

	public static void main(String[] args) {
		
		System.out.println("성적을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		
		if(score>=70)
			System.out.println("합격");
		else
			System.out.println("불합격");
					
//-----------------------------------------------------------------------//			
			
		System.out.println("나이를 입력해주세요");
		int age = sc.nextInt();
		
		if(age>=20)
			System.out.println("성년");
		else
			System.out.println("미성년");
	}

}
