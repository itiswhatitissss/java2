package ex02;

import java.util.*;

public class Exam06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String gender = sc.nextLine();
		int age = sc.nextInt();
		
		if(gender.equals("남")) { //성별 == "남" // 문자열비교는 == 아니고, equals
			if(age >=20) 
				System.out.println("ㅅㄱ");
			else 
				System.out.println("군대안간다");
		}
		else 
			System.out.println("군대안간다");
	}
	
//	Scanner sc = new Scanner(System.in);
	
//	int age = sc.nextInt();
//	sc.nextLine(); -->  <<<age가 먼저 나오게 되면 엔터까지 다음 scanner로 인식하여 나이 엔터를 입력하면 끝나는 경우가 있음 그래서 sc.nextLine()을 입력해줌으로써 엔터를 한번 씹어줄 수 있음.>>>
//	String gender = sc.nextLine();
//	
//	if(gender.equals("남")) { //성별 == "남" // 문자열비교는 == 아니고, equals
//		if(age >=20) 
//			System.out.println("ㅅㄱ");
//		else 
//			System.out.println("군대안간다");
//	}
//	else 
//		System.out.println("군대안간다");
//}
		
	

}
