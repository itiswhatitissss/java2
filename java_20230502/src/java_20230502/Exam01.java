package java_20230502;

import java.util.*;


class Member{
	String name;
	int age;
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
public class Exam01 {

	public static void main(String[] args) {
		 
		ArrayList<Integer> list1 = new ArrayList();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		System.out.println(list1.size());
		
	
		
		for(int i=0;i<list1.size();i++)
			System.out.println(list1.get(i));
		
	}

}
