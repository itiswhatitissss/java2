package ex06;
//배열에서 최대 최소 구하기
import java.util.Arrays;

public class Exam03 {

	public static void main(String[] args) {
		final int len = 10;
		int[] arr = new int[len];
		
		for(int i=1;i<arr.length;i++) {
		arr[i] = (int)(Math.random()*100)+1;}
		
		System.out.println(Arrays.toString(arr));

		int max = arr[0];
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++)
			if(max<arr[i]) 
				max=arr[i];
			else if(min>arr[i])
				min=arr[i];
		
		
		System.out.println();
		System.out.println(max);
		System.out.println("\n"+min);
			
		
				
		
		
	

}
}