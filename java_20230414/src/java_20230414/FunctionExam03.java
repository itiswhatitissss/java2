package java_20230414;

public class FunctionExam03 {

	public static void main(String[] args) {	
		
		int convertIntoutput = convertInt(4.3);
		System.out.println();
		
		convertString('f','b');
		
		int aa = sum();
		System.out.println(aa);
		
		double bb = aa();
		System.out.println((int)bb);

		cc();
	}
	
	static int convertInt(double f) {
		int result = (int)f;
		return result;
	}
	
	static void convertString(char v, char b) {
		System.out.println("문자열로 변환: "+v+b);
	}
	
	static int sum() {
		int i = 10+20;
		return i;
	}
	static double aa() {
		return 10.2;
	}
	static void cc() {
		System.out.println((int)10.9);
	}
	
}
