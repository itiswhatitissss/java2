package ex01;

import java.util.Arrays;

class Card {
	void info () {
		System.out.println("Card()");
	}
}


public class Exam01 {

	public static void main(String[] args) {
		
		String str = "korea";
		System.out.println(str);
		
		str="korea";
		System.out.println(str);
		
		System.out.println(str.indexOf('k'));
		System.out.println(str.replace('k', 'c'));
		
		
		String study = "kor,math,aa";
		String [] aaa = study.split(",");
		System.out.println(Arrays.toString(aaa));
	}
}