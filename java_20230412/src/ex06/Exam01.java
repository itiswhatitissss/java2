package ex06;
import java.util.*;

/*조원 3명의 점수를 입력받아서
자바점수 배점은 랜덤함수 이용해서 50~100값이 저장되도록 한다
조원 총점, 평균을 출력한다*/

public class Exam01 {

	public static void main(String[] args) {

		int a =(int)(Math.random()*50)+51;
		int b =(int)(Math.random()*50)+51;
		int c =(int)(Math.random()*50)+51;
		
		System.out.println("하림 : " + a);
		System.out.println("성진 : " + b);
		System.out.println("현호 : " + c);
		
		System.out.println(a+b+c);
		System.out.println((a+b+c)/3);
		
	}

}
