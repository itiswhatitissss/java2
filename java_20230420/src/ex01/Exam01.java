package ex01;

class A{
	void func() {
		System.out.println("AAAAAAAAAAAAAAAA");
	}
		
		
}

class B extends A{
	int a =1;
	void func() {
		System.out.println("BBBBBBBBBBBBBBBBBBBBBBB");
	}
	void func2() {
		System.out.println("이하림 바보");
	}
}
	
class C extends B{
	int a=0;
	void func() {
		System.out.println("CCCCCCCCCCCCCCCCCCCCCCCC");
	}
}
	

public class Exam01 {

	public static void main(String[] args) {
		
		
		// 상위   =  하위 상위클래스는 하위클래스 참조가능
		B b = new C();
		b.func();
		b.func2();
		
		//(B)=> 필드값을 채워주는 느낌
		A aaa = new B();
		B bbb = (B)aaa;
	}
	

}
