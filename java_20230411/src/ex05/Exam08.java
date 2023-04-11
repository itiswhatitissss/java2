package ex05;

public class Exam08 {

	public static void main(String[] args) {
		
		int num = 12345;
		int sum = 0;
		
		while(num>0) {
			sum+=num%10; //5
			num=num/10; //1234
		}
		
		
		for(;;)
		System.out.println(sum);
		
		//문자열로 변환해서 구하는 법
		/*
		 * int num = 12345; int sum = 0; String a = Integer.toString(num);
		 * 
		 * for(int i=0;i<a.length();i++) { char b = a.charAt(i); sum+=b-'0';}
		 * 
		 * System.out.println(sum);
		 */

	}

}
