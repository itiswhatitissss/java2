package ex05;
import java.util.*;
//몇개의 숫자를 받을지 물어보는 코드 작성
//숫자를 받아서 짝수의 값만 합해서 나오는 코드 작성
//소수점이나 문자 입력하면 오류 후 종료
public class Dowhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("몇개 입력할거야?");
		int limit = sc.nextInt();
		System.out.println("정수만 입력하도록");
		
		for(int i=1;i<=limit;) {
<<<<<<< HEAD
			
			int input = sc.nextInt();
			
			if(input%2==0) {
				input = sc.nextInt();
				i++;
				sum += input;}
			//if(sc.hasNextInt()) --> 입력값이 정수이면 True
			
			else if(input%2==1) {
				i++;
				continue;}
			
			else if(sc.hasNextDouble()) {
					sc.next();
					System.out.println("정수만 입력하셔요");
					continue;
=======
			int input = sc.nextInt();
			if(input%2==0) {
				i++;
				sum += input;}
			else if(input/1.0!=0)
				System.out.println("정수를 입력해주세요");
		}
		System.out.println(sum);	
>>>>>>> f809a2e0a2132674af1e2f01f9fbb5e4ae4a2362
		}
		}
		System.out.println("합 = "+sum);	
	}
<<<<<<< HEAD
	}
=======
>>>>>>> f809a2e0a2132674af1e2f01f9fbb5e4ae4a2362
