package ex04;

class Apple {
	public String toString() {
	return "I am an apple";
	}
}
class orange {
	public String toString() {
		return "I am an orange";
	}
}
class box <T> { //사과 오렌지 둘 다 담을 수 있는 박스
	private T obj;
	
	public T getobj() {
		return obj;
	}	
	public void setobj(T obj) {
		this.obj=obj;
	}
}


public class Exam01 {

	public static void main(String[] args) {
		box<Apple> abox = new box<Apple>();//사과
		box<orange> obox = new box<orange>();//오렌지
		
		abox.setobj(new Apple());//사과 저장
		obox.setobj(new orange());//오렌지 저장
		
		Apple ap = (Apple)abox.getobj();
		orange or = (orange)obox.getobj();
		
		System.out.println(ap);
		System.out.println(or);
		
	}

}
