package java_20230414;

import java.util.Arrays;


// String main(int num){ ---->main이란 함수에 정수값을 입력하고 출력값은 string이 된다.
//	return "문자열"
//}

// void main(int num) -> void가 들어가면 return 안써도 됨

//void : 반환타입, main : 함수명, () : 매개변수 타입, {} : 함수 수행 문장


public class FunctionExam01 {
//1. 더하기 : 반환타입 O, 매개변수 O
	public static void main(String[] args) {
		System.out.println("start");
		System.out.println("end");
		
		int num =convertInt(30.2);
		int sum =add(4,3);
		
		System.out.println(num);
		System.out.println(sum);
	}   
	
	static int convertInt(double f){  //double f      = int 
		int result = (int)f;
		return result;
	}
	static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
}
