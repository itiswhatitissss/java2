package ex02;

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
class Applebox {
	private Apple ap;
	
	public Apple getAp() {
		return ap;
	}	
	public void setAp(Apple ap) {
		this.ap=ap;
	}
}
class orangebox {
	private orange or;
	
	public orange getAp() {
		return or;
	}	
	public void setAp(orange or) {
		this.or=or;
	}
}


public class Exam01 {

	public static void main(String[] args) {
		Applebox abox = new Applebox();
		orangebox obox = new orangebox();
		
		abox.setAp(new Apple());
		obox.setAp(new orange());
		
		Apple a = abox.getAp();
		orange o = obox.getAp();
		System.out.println(a);
		System.out.println(o);
	}

}
