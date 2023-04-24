package ex4;

public class Exam03 {

	//1~100까지 홀수의 갯수
	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i=1; i<=100; i++) 
			if(i%2==1)
				count++;
			
		System.out.println("1. 홀수의 갯수" + count);
		
		
		count = 0; //위에서 내려온 count값 초기화 시키고
		for(int i=1; i<=100; i+=2) 
				count++;
		
		System.out.println("2. 홀수의 갯수" + count);
	}

}
