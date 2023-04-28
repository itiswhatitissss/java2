package ex04;
class A{}
class B extends A{}
class C extends B{}

class Box<T> {
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
	
}

class Unboxer {
	public static void peekBox(Box<? extends B> box) { //상한 제한 B 밑으로 다 돼
		System.out.println(box.getOb());
	}
}

public class GenericExam {

	public static void main(String[] args) {
		Box<A> abox = new Box();
		Box<B> bbox = new Box();
		Box<C> cbox = new Box();
		
//		Unboxer.peekBox(abox); //에러 왜? -> ? extends B 이기 때문에 B밑으로만 가능해
		Unboxer.peekBox(bbox);
		Unboxer.peekBox(cbox);
	}

}
