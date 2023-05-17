package ex01;

interface A{
	void use();
//	void funcd();
//	void funce();
}

class B implements A {

	@Override
	public void use() {
		System.out.println("예썰");
	}

//	@Override
//	public void funcd() {
//	}
//
//	@Override
//	public void funce() {
//	}
	
}

class C implements A {

	@Override
	public void use() {
		System.out.println("예업");
	}

//	@Override
//	public void funcd() {
//	}
//
//	@Override
//	public void funce() {
//	}
	
}

class D extends B {
	public void use() {
		System.out.println("^^");
	}
	
	public void funcd() {
		System.out.println("funcd");
	}
}

class E extends C {
	public void use() {
		System.out.println("^.^");
	}
	
	public void funce() {
		System.out.println("funcE");
	}
	
}




public class Practice {
	static void test(A test) {
		((E)test).funce();
		((D)test).funcd();
	}

	public static void main(String[] args) {
//		C c = new C();
//		c.use();
//		
//		D d = new D();
//		d.use();
		test(new D());
		test(new E());
		
	}

}
