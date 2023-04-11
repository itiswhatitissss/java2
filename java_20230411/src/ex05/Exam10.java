package ex05;
import java.util.*;
public class Exam10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int com = (int)(Math.random()*100)+1;
		int count = 0;
		
		while(true) {
			System.out.println("값 입력");
			int input = sc.nextInt();
			count++;
			System.out.println("삐 : "+count);
			if(com>input)
				System.out.println("크다");
			else if(com<input)
				System.out.println("작다");
			else if(input==com) {
				System.out.println("정답입니다");
				break;}
			
		}
			}
			
	}



