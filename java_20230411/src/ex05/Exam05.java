package ex05;
//구구단
public class Exam05 {

	public static void main(String[] args) {
		

		//for구구단
		
//		for(int i=2;i<=9;i++)
//			for(int j=1;j<=9;j++)
//				System.out.println(i*j);
		
		//while 구구단
		
		int a = 2;
		int b = 1;
		
		while(a<=9) {
			b=1;
		
			while(b<=9) {
				System.out.println(a*b);
				b++;
			}
			a++;
		}
		
		int c=5;
		while(c--!=0) {
			System.out.println(c+"-icandoit");
		}
		
	}

}
