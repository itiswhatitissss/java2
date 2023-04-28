package ex03;
class Box<T>{
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
	
}

class Unboxer {
//	public static void peekBox(Box<? extends Number> box) { //상한 제한 Number 밑으로 다 돼
	public static void peekBox(Box<? super Integer> box) { //하한 제한 Integer 위로 다 돼 
		System.out.println(box.getOb());
	}
}

public class GenericExam {

	public static void main(String[] args) {
		Box<Integer> ibox = new Box();
		ibox.setOb(123);
		
		Box<Double> dBox = new Box();
		dBox.setOb(123.123);
		
		Unboxer.peekBox(ibox);
//		Unboxer.peekBox(dBox);
	}

}
