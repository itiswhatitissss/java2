package ex4;


public class Exaam01 {

	public static void main(String[] args) {

		int total = 0;
		int num = 200;
		
		for(int i=1; i<=num; i++) //for(초기; 검사; 증가;)
			total += i;           //for 수행문장
		
		System.out.println("1~" + num + "까지 합 : " + total);
	}

}

