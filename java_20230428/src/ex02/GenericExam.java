package ex02;
class Box<T>{
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
	
//	public void swap(Box<T> aa) {
//        T tmp = this.ob;
//        this.ob = aa.ob;
//        aa.ob = tmp;
//    }


}


public class GenericExam {

	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		box1.setOb(99);
		Box<Integer> box2 = new Box<>();
		box2.setOb(55);
		//99, 55
		System.out.println(box1.getOb()+"&"+box2.getOb());
//		box1.swap(box2);
		swapbox(box1, box2);
		//55, 99
		System.out.println(box1.getOb()+"&"+box2.getOb());
	}
	static <T> void  swapbox(Box<T> box1, Box<T> box2){
		Box<T> tmp = new Box();
		tmp.setOb(box1.getOb());
		box1.setOb(box2.getOb());
		box2.setOb(tmp.getOb());
	}

}
