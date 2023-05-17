package ex01;

import java.util.function.BiFunction;

interface e{
	int sumArr (int[] arr);
}


public class Exam01 {

	public static void main(String[] args) {
		e ee = (arr) -> {
			int sum=0;
			for(int i :arr)
				sum+=i;
			return sum;
		};
		
		int[] arr = {1,2,3};
		int sum = ee.sumArr(arr);
		System.out.println(sum);
		
		BiFunction<String, Integer, String> bi = (name,age) -> name+age;
		System.out.println(bi.apply("이름은"+"홍길동"+"이고",24));
		
	}

}
