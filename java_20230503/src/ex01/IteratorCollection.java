package ex01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class IteratorCollection {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
		//for문을 이용한 기본적인 출력 코드
//		for(String str : list)
//			System.out.println(str);
		
		//반복자 614p
		Iterator<String> a =list.iterator();
		while(a.hasNext()) {
			String st = a.next();
			System.out.println(st);
		}
		
		//한번 더 찍어주려면 반복자를 한번 더 입력해줘서 초기화 해줘야 됨 안그러면 안찍힘
		a =list.iterator();
		while(a.hasNext()) {
			String st = a.next();
			System.out.println(st);
		}
		
		a=list.iterator();
		while(a.hasNext()) {
			String st = a.next();
			if(st.equals("Box")) {
				a.remove();
			}
		}
	}

}
