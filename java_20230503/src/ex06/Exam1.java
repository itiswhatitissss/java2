package ex06;

import java.util.function.BiFunction;

interface x{
	int square(int xx);
}

interface A{
	int max(int a, int b);
}
public class Exam1 {
	public static void main(String[] args) {
		x m = (xx) -> xx*xx;
		System.out.println(m.square(5));
		
		BiFunction<Integer, Integer, Integer> bi = (a,b)-> a>b?a:b;
		System.out.println(bi.apply(1, 5));
		
	}
}
