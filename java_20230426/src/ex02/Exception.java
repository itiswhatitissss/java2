package ex02;

public class Exception {
	public static void main(String[] args) {
	System.out.println("프로그램 시작");
	printLength("Thisjava");
	printLength(null);
	System.out.println("프로그램 종료");
	
	}

	private static void printLength(String data) {
		int result=3;
		try {
			result = data.length();
		}catch(NullPointerException e) {
		System.out.println(e.toString());	
		e.printStackTrace();
		}
		System.out.println("문자수 : "+result);
	}
}
