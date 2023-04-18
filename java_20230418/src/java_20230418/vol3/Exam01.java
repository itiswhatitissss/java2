package java_20230418.vol3;

class Member{
	private String name; //private붙이면 class Member안에서만 입력이 가능함 따라서 11번 setData함수처럼 class Member안에 입력할 수 있는 함수를 따로 입력해줘야 함
	private int age;
	
	void display() {
		System.out.println(name + ", "+age);
	}
	
	void setData(String n, int a) {
		name=n;
		age=a;
	}
}

public class Exam01 {

	public static void main(String[] args) {
		
		Member user1 = new Member();
		user1.setData("이성진", 26);
		
		Member user2 = new Member();
		user2.setData("이하림", 40);
		
		user1.display();
		user2.display();
		
	}

}
