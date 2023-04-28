package ex05;
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
	public static void peekBox(Box<? super A> box) { //하한 제한 A 위로 다 돼
		System.out.println(box.getOb());
	}
}

public class GenericExam {

	public static void main(String[] args) {
		Box<A> abox = new Box();
		Box<B> bbox = new Box();
		Box<C> cbox = new Box();
		
		Unboxer.peekBox(abox); 
//		Unboxer.peekBox(bbox); //에러 왜? -> ? super A 이기 때문에 A위로만 가능해
//		Unboxer.peekBox(cbox); //에러 왜? -> ? super A 이기 때문에 A위로만 가능해
	}

}
