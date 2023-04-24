package ex03;
import java.util.*;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("숫자를 입력해주세요");
		int num = sc.nextInt();
		
		
		if(num%2==0 && num%3==0)
			System.out.println("2와 3의 배수입니다");
		else
			System.out.println("2와 3의 배수가 아닙니다");
		
	}

}
