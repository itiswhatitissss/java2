package ex01;
class bag {
	int capacity;
	suncream sun; //포함 관계
	public bag() {
		System.out.println("bag class");
	}
	void move(){
		System.out.println("가방 옮기다");
	}
	
}

class suncream {
	int vol;
	public suncream() {
		System.out.println("suncream class");
	}
	void cover() {
		System.out.println("선크림 바르다");
	}
}
public class Exam {

	public static void main(String[] args) {
		bag bg = new bag();
		bg.sun=new suncream();
		bg.sun.cover();
	}

}
