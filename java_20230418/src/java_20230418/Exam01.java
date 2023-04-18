package java_20230418;

class Member{
	String name;
	int age;
	int num;
	
	
	static int ban;
	static String ac;
	
	void info() {
		age=ban;
		ban=num;
	}
	static void sinfo() {
		ban=200;
	}
}

public class Exam01 {

	public static void main(String[] args) {
		Member m = new Member();
		
		m.info();
		m.age=m.ban;
		m.ban=m.age;
		
		
	}

}
