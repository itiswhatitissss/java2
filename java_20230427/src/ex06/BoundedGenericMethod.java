package ex06;

class Box<T>{
	private T ob;
	public void set(T o) {
		ob=o;
	}
	public T get () {
		return ob;
	}
}

class BoxFactory{
	public static <T extends Number> Box<T> makeBox(T o){ // 제네릭으로 T자체에도 제약을 주어준다 즉, T 값도 Number(실수,정수)만 가능하다는 말씀
		Box<T>box = new Box<T>();
		box.set(o);
		
		System.out.println("Boxed Data : "+o.intValue());
		return box;
	}
}

class Unboxer{
	public static <T extends Number> T openbox(Box<T> box){
		
		System.out.println("unboxed Data : "+ box.get().intValue());
		return box.get();
	}
}


public class BoundedGenericMethod {

	public static void main(String[] args) {
		Box<Integer> sBox = BoxFactory.makeBox(new Integer(7777));
		Integer n = Unboxer.openbox(sBox);
		System.out.println("n : "+n);

	}

}
