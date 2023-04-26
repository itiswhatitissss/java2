package ex05;

public class Exception1 {
	
	public static void main(String[] args) {
		try {
			findClass();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
//		System.out.println("프로그램 종료");
	}

	private static void findClass() throws ClassNotFoundException {

			Class.forName("java.lang.String2");
	
	}
}
		
	
