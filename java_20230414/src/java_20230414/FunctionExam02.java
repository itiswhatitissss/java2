package java_20230414;

public class FunctionExam02 {

	public static void main(String[] args) {
		add(10,20); //함수의 return이 없는 경우 변수를 따로 지정해주지 않음, 함수 명 매개변수 입력 후 출력
	}

	static void add(int n1, int n2) {
		System.out.println("더하기 :" + (n1+n2));
	}
}
