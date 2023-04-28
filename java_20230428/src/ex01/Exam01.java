package ex01;
class A{}
class B extends A{}
class C extends B{}

class Box<T extends A> {
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
	
}

class Unboxer{
	public static <T extends A> T openBox(Box<T> box) {
		return box.getOb();
	}
}
public class Exam01 {

	public static void main(String[] args) {
//		Box<Integer> box1 = new Box();
//		box1.setOb(10);
//		Integer output1 = Unboxer.openBox(box1);
//		System.out.println(output1);
//		
//		Box<String> box2 = new Box();
//		box2.setOb("aaa");
//		String output2 = Unboxer.openBox(box2);
//		System.out.println(output2);
		Box<C> cbox = new Box();
		
		
		
	
	}

}
