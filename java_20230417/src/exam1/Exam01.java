package exam1;

class Member{
	//1. 함수 이름 같음, 2. 매개변수 타입 or 갯수가 달라야한다. overloading
	int func(int n) {
		return n;
	}
	double func(double d) {
		return d;
	}
	String func(String str) {
		return str;
	}
	int func(int n1,int n2) {
		return n1+n2;
	}
}
public class Exam01 {

	public static void main(String[] args) {
		Member m = new Member();
		
		System.out.println(m.func(10));

	}

}
