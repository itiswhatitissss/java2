package ex01;

import java.util.*;

public class practice1 {

	public static void main(String[] args) {
		//ex1
	    Scanner sc = new Scanner(System.in);
	    System.out.println("입력");
	    
	    //초
	    int second = sc.nextInt();
	    System.out.print(second%60+"sec");
	    
	    //분
	    int minute = second/60;
	    System.out.print(minute%60+"min");
	    
	    //시
	    int hour = minute/60;
	    System.out.print(hour+"hour");
	    
	    
	    //ex2
		/*
		 * Scanner ssc = new Scanner(System.in); System.out.println(); int num =
		 * ssc.nextInt();
		 * 
		 * int second2 = num % 60; int hour2 = num
		 */
	    		
	    

	}

}
