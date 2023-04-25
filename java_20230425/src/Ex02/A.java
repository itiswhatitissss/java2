package Ex02;
//중첩 클래스!
public class A {
	
	class B {
		void test() {}
		int field = 10; //멤버변수, 인스턴스변수
		static int field2 =1;
	
		B(){
			System.out.println("B객체생성");
		}
	}
	
	class C{
		C(){
			System.out.println("C객체생성");
		}
	}
	
	B field = new B();
	C field2 = new C();
	
	A(){
		System.out.println("A객체생성");
		B b = new B();
	}
	
	void method() {
		B b = new B();
	}
}
