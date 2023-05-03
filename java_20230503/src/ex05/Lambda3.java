package ex05;

interface Myfunction1{
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
public class Lambda3 {

	public static void main(String[] args) {
		
		Myfunction1 m = 
				(a,b) -> {return a>b ? a:b;};
				
				System.out.println(m.max(5, 3));
	}

}
