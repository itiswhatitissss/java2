package ex07;


class Box<T>{
	T ob;
	public void set(T o) {
		ob=o;
	}
	public T get() {
		return ob;
	}
}

class SteelBox<T> extends Box<T>{
	public SteelBox(T o) {
		ob=o;
	}
}

public class Exam {

	public static void main(String[] args) {
		Box<Integer> iBox = new SteelBox<Integer>(100);
		Box<String> sBox = new SteelBox<String>("korea");
		System.out.println(iBox.get());
		System.out.println(sBox.get());
	}

}