package ex06;
//배열을 오름차순 정렬하기
import java.util.Arrays;

public class Exam04 {

	public static void main(String[] args) {
			final int len = 10;
			int[] arr = new int[len];
			
			for(int i=1;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100)+1;}
			
			System.out.println(Arrays.toString(arr));
			
			int first = arr[0];
			
			for(int i=0;i<arr.length;i++) 
				
				//for(int j=i;j<arr.length;j++) {  //오름차순
				for(int j=0; j<arr.length;j++) { //내림차순
					if(arr[i]>arr[j]) {
						int tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
								
					}
					
				}
					
			
				
			
			
			System.out.println(Arrays.toString(arr));
				

	
	}

}
