package ex06;
//로또프로그램 만들기
import java.util.Arrays;
import java.util.*;
public class Exam05another {

	public static void main(String[] args) {
		
		int[] lotto = new int[45];
		
		for(int i=0;i<lotto.length;i++)
			lotto[i] = i+1;
		//섞기전 System.out.println(Arrays.toString(lotto)); 
		for(int i=0; i<lotto.length;i++) {
			int num=(int)(Math.random()*45);
			int tmp = lotto[i];
			lotto[i] = lotto[num];
			lotto[num] =tmp;
		}
		//섞고난 후System.out.println(Arrays.toString(lotto));
		
		System.out.println("로또 번호는");
		for(int i=0;i<6;i++)
			System.out.print(lotto[i]+", ");
		
		

		
		
		
		
		
		
	}

}
