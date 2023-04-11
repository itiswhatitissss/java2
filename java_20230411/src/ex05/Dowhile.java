package ex05;
import java.util.*;
//몇개의 숫자를 받을지 물어보는 코드 작성
//숫자를 받아서 짝수의 값만 합해서 나오는 코드 작성
//소수점이나 문자 입력하면 오류 후 종료
public class Dowhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.println("몇개 입력할거야?");
			int limit = sc.nextInt();
			System.out.println("정수만 입력하도록");
			for(int i=1;i<=limit;i++) {
				int input = sc.nextInt();
				if(input%2==0)
					sum += input;
				else
					break;
					
			}
			
			System.out.println(sum);
		}
	}

}
