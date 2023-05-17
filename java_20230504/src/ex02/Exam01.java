package ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Justsort{
	public void sort(List<?> list) {
		Collections.reverse(list);
	}
}

public class Exam01 {
	public static void main(String[] args) {
		List<Integer> is = Arrays.asList(1,3,5,7,9);
		System.out.println(is);
		is = new ArrayList<>(is);
		System.out.println(is);
	}
}
