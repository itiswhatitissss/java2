package ex4;

public class Exam05 {
//3이상 4462 이하 짝수의 합
	public static void main(String[] args) {
		int sum = 0;
		
//		for(int i=2; i<=4462; i+=2)
//			sum +=i;
//		System.out.println(sum-2);
		
		for(int i=3; i<=4462; i++)
			if(i%2==0)
				sum += i;
		System.out.println(sum);
				
	}

}

 

