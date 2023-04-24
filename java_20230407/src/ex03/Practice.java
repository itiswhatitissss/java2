package ex03;

import java.util.*;

public class Practice {
	//문제4. 사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 합계와 평균을 구해보자.
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);


	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();
	
	int sum = num1 + num2 + num3;
	int avg = (num1 + num2 + num3)/3;
	
	if(num1 >= num2 && num1 >= num3)
		System.out.println("num1최대값");
	else if(num2 >= num1 && num2 >= num3)
		System.out.println("num2최대값");
	else if(num3 >= num1 && num3 >= num2)
		System.out.println("num3최대값");

	if(num1 <= num2 && num1 <= num3)
		System.out.println("num1최소값");
	else if(num2 <= num1 && num2 <= num3)
		System.out.println("num2최소값");
	else if(num3 <= num1 && num3 <= num2)
		System.out.println("num3최소값");
	
	System.out.println("합계 : "+ sum);
	System.out.println("평균 : "+ avg);
	
	
	
	
	
		
		
	
	
}
}
