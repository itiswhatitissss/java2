package ex01;

public class Exam04 {

	public static void main(String[] args) {

		int jumsu = 80;
		
		String result=null;
		
		//삼항 연산자 or 조건 연산자

		result = (jumsu >= 60) ?  "합격" : "불합격" ; //(): 조건 , true면 합격 false면 불합격.
		System.out.println("당신은" + result + "입니다");
	}

}
