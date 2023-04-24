package java_2320418vol6;

class 사람{
	String name;
	int age;
	public 사람(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public 사람(String name) {
		this.name=name;
	}
	public 사람() {
	}
}
class 이성진 extends 사람{
	double weight;
	public 이성진(String name,double weight) {
		super(name);
		this.weight=weight;
	}
	
//	public 이성진(String name, int age, double weight) {
//		this.name=name;
//		this.age=age;
//		this.weight=weight;
//		
//	 	}
	void disply() {
		System.out.println(name +", "+age+", "+weight);
	}
}


class 이하림 extends 사람{
	double weight;
	String name;
	int age;
	
	public 이하림(String name, int age, double weight) {
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	
 	void disply() {
 		System.out.println(name +", "+age+", "+weight);
 	}
}


//class 장현호 extends 사람{
//	String grade;
//	
//	public 장현호() {
//		this.name=name;
//		this.age=age;
//		this.grade=grade;
//	}
// 	void disply() {
// 		System.out.println(name +", "+age+", "+grade);
// 	}
//}

	

public class Practice {

	public static void main(String[] args) {
		이성진 user = new 이성진("성진",24.3);
		user.disply();
		
		이하림 user1 = new 이하림("하림",25,3.4);
		user1.disply();
		
	}

}
