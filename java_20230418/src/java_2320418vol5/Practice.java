package java_2320418vol5;

class 사람{
	String name;
	int age;
	public 사람(String name, int age) {
		this.name=name;
		this.age=age;
	}
}
class 이성진 {
	String name;
	int age;
	double weight;
	
	public 이성진(String name, int age, double weight) {
		this.name=name;
		this.age=age;
		this.weight=weight;
		
	 	}
	void disply() {
		System.out.println(name +", "+age+", "+weight);
	}
}


class 이하림 {
	int name;
	int age;
	double weight;
	
	public 이하림() {
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
 	void disply() {
 		System.out.println(name +", "+age+", "+weight);
 	}
}


class 장현호 {
	int name;
	int age;
	String grade;
	
	public 장현호() {
		this.name=name;
		this.age=age;
		this.grade=grade;
	}
 	void disply() {
 		System.out.println(name +", "+age+", "+grade);
 	}
}

	

public class Practice {

	public static void main(String[] args) {
		이성진 user = new 이성진("이성진",25,144);
		user.disply();
	}

}
