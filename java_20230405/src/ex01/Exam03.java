package ex01;

public class Exam03 {

	public static void main(String[] args) {
		
		
		//num = num-1 //num-=1 //num-- //--num 다 똑같 
		
		int num = 10;
		int sum = 0;
		int tmp = 0;
		
		tmp = ++num; // 1. ++num -> 2. tmp = ++num
		sum = num++; // 1. sum = num++ -> 2. num++
		
		System.out.println(tmp);
		System.out.println(num);
		System.out.println(sum);
		
		
		

	
	}

}
