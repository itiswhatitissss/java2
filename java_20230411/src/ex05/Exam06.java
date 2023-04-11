package ex05;

public class Exam06 {
//문자열 입력됐을 때 각 자리의 합을 더한 결과를 출력
	public static void main(String[] args) {
		
		String str = "12345";
		int sum=0;
//		char aa = str.charAt(i);
		
		for(int i=0;i<str.length();i++) {
			char tmp = str.charAt(i); //tmp
			sum += (tmp-'0'); //아스키 코드표 상 '1'과 1은 다름

		
		}
			
			
			System.out.println(sum);
	}

}
