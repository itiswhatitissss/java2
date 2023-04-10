package ex4;

public class Exam08 {
//Exam07과 동일한 문제
	public static void main(String[] args) {
		
		int sum=0;
		int sign=1;
		int tmp=0;
		
		for(int i=1; true ; i++, sign=-sign) {
			tmp = sign*i;
			sum+=tmp;
			if(sum>=100)break;
			
		}
		System.out.println(sum);
		System.out.println(tmp);
	}
}
