package ex01;

public class Exam02 {

	public static void main(String[] args) {

		//byte < short < int < long < float < double
		// 1 	   2      4      8      4       8
		//-> 자동형변환
		// 연산이나 대입할 떄 타입이 일치하지 않으면 실행이 안된다.
		// 따라서 먼저 타입을 일치 시킨다. 타입을 일치시킬 때 형변환이 발생한다.
		
		double d = 85.4;
		int score = 10;
		
		d = score;
	//	d = (double)score; => 자동으로 내부적으로 이런 작업이 이뤄짐.
		System.out.println(d);


		score = (int) d;
	//	score = (int) d => score(int) 안에 score보다 큰 d(double)가 들어가므로, d 앞에 (int)를 붙여줌으로써 해당 식이 정상적으로 돌아가게 만들어 준다.
		System.out.println(score);

		System.out.println(5/(double)2);
		System.out.println(5&2);
		System.out.println(5|2);
}
}