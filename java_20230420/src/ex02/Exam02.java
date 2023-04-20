package ex02;
class util {
	int x,y;
	void move(int x, int y) {}
	void stop() {}
}
class Marine extends util {
	void stimpack() {}
	void move(int x, int y) {
		System.out.println("걸어서");
	}
}
class Tank extends util{
	void changemode() {}
	void move(int x, int y) {
		System.out.println("탱크로");
	}
class Dropship extends util{
	void load() {}
	void unload() {}
	void move(int x, int y) {
		System.out.println("날아서");
}
}
public class Exam02 {

	public static void main(String[] args) {
		Dropship dr = new Dropship();
		move(dr);
		
	}
	static void move(util u) {
		u.move(10,10);
	}
}