package ex06;

class Box<T>{
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
}

class Toy {
	public String toString() {
		return "i am a Toy()";
	}
}

class BoxHandler {
	public static void outBox(Box<? extends Toy> box) {
		Toy toy = box.getOb();
//		box.setOb(new Toy());
		System.out.println(toy);
	}

	public static void inBox(Box<? super Toy> box, Toy n) { 
		box.setOb(n);
//		box.getOb(new Toy());
		
	}
	
}

public class Wildcard {

	public static void main(String[] args) {
		Box<Toy> box = new Box();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
	
	}
	

}
