package ex02;

import java.util.*;

public class Exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("면접점수");
		int a = sc.nextInt();
		System.out.println("실기점수");
		int b = sc.nextInt();
		
		if(a>=70 && b>=70)
			System.out.println("합격");
		else
			System.out.println("불합격");		
		
		//<<<중괄호를 넣어야지 중괄호 안에 묶인게 한번에 실행>>>
		if(a >= 70) {
			System.out.println("good");
			System.out.println("bad");
		} 
		
	}}
//----------------------------------------------------------//
