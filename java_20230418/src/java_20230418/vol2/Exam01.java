package java_20230418.vol2;

class Member{
	private String name;
	private int age;
	
	void display() {
		System.out.println(name + ", "+age);
	}
	//생성자 ==> 반환타입x, 클래스 이름과 같다. 오버로딩이 가능하다!!!!, 초기화 기능도 가지고 있음.
	//this : 지역변수와 멤버변수가 충돌할 때 this를 붙이면 멤버변수를 의미함
	public Member(String name, int age) { 
		this.name=name; //this : 지역변수와 멤버변수가 충돌할 때 this를 붙이면 멤버변수를 의미함
		this.age=age;
	}
	public Member() {
		this("미정의",1);
	}
	public Member(String name) {
		this.name=name;
		
	}
	
	
	
}

public class Exam01 {

	public static void main(String[] args) {
		
		Member user1 = new Member("이성진",26);	//객체가 생성되면서 생성자를 찾아 바로 입력해줘도 실행이 된다 	
		Member user2 = new Member("이하림",55);
		Member user3 = new Member(); //값에 맞는 생성자를 만들어줌으로써 출력해줄 수 있음
		Member user4 = new Member("이성진");
		
		user1.display();
		user2.display();
		user3.display();
		user4.display();
	}

}
