package ex03;

import java.util.*;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("숫자를 입력해주세요");
		int num = sc.nextInt();
		
		
		if(num%2==0) //num%2 != 0도 똑같은 결과
			System.out.println("짝수");
		else if(num%2==1)
			System.out.println("홀수");
		
	}

}
