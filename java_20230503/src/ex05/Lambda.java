package ex05;

interface Myfunction{
	int max(int a, int b); //추상메소드
}

//class Mymax implements Myfunction {
//
//	@Override
//	public int max(int a, int b) {
//		return a>b ? a:b;
//	}
//	
//}
public class Lambda {

	public static void main(String[] args) {
		Myfunction m = new Myfunction() { //익명객체

			@Override
			public int max(int a, int b) {
				return a>b ? a:b;
			}
			
		};
		System.out.println(m.max(6, 2));
		
	}

}
