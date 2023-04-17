package java_20230417;

class Member1{
	int age; //멤버변수, 인스턴스(==객체) 변수(객체를 생성해야 접근 가능)
	static int num; //클래스변수, 정적변수, 공유변수(객체를 생성하지 않고서도 접근 가능)
}
public class Practice {

	public static void main(String[] args) {
		
		Member1 user1 = new Member1();
		user1.age=10;
		user1.num=15;
		
		Member1 user2 = new Member1();
		user2 = user1;
		user2.num=30;
		
		System.out.println(user1.age);
		System.out.println(user2.age);
		System.out.println(user1.num);
		System.out.println(user2.num);
		
		
	}

}
  