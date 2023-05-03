package ex02;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollection {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet();
		
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Box");
		set.add("kor");
		set.add("eng");
		
		for(String str : set)
			System.out.println(str);
		
	}

}
