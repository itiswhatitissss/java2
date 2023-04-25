package Ex04;

public class A {
	
	A(){
		class B{
			public B() {
				System.out.println("B객체생성");
			}
		}
		B b = new B();
		System.out.println("A객체생성");
	}
	void method() {
		class C{
			public C() {System.out.println("C객체 생성");}
		}
		C c = new C();
	}
}

