package ex01;

class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "이름 : " + name + ", 나이 : "+age;
	}
	
}

class Student extends Person{

	private int grade;
	
	public Student(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}
	
	
	
}

public class Exam01 {

	public static void main(String[] args) {
		Person p = new Student("홍길동",20,3);
		System.out.println(p.toString());
	}

}
