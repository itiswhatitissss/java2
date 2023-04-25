package Ex03;

public class A {
	
	static class B {
		void test() {}
		int field = 10; //멤버변수, 인스턴스변수
		static int field2 =1;
	
		B(){
			System.out.println("B객체생성");
		}
	}
	
	static class C{
		C(){
			System.out.println("C객체생성");
		}
	}
	
	B field = new B();
	C field2 = new C();
	
	A(){
		B b = new B();
		System.out.println("A객체생성");
	}
	
	void method() {
		B b = new B();
	}
	
	static void method2() {
		B b = new B();
	}
}
