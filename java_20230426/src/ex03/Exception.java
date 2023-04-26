package ex03;

public class Exception {
	
	public static void main(String[] args) throws ClassNotFoundException{
		
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.String 존재");
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
		
	
}