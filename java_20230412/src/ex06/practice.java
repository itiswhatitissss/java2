package ex06;

import java.util.Arrays;

public class practice {

	public static void main(String[] args) {
		
		final int aa = 10;
		int[] arr = new int[aa];
		
		for(int i=0;i<arr.length;i++)
			arr[i] = (int)(Math.random()*100)+1;
		
		System.out.println(Arrays.toString(arr));
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]<arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			
		}
		System.out.println(Arrays.toString(arr));
				
		
		
	}

}
