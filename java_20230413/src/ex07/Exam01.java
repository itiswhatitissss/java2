package ex07;

import java.util.Arrays;

public class Exam01 {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		System.out.println(Arrays.toString(arr));
		
		int[] arr2= new int[10];
		
		for(int i=0;i<arr.length;i++) //복사
			arr2[i]=arr[i];
		
		System.out.println(Arrays.toString(arr2));
		
		
		System.out.println("-------------------------------------"); //위에 방법 말고~
		
		System.arraycopy(arr, 0, arr2, 0,arr.length);//arr[0]에서 시작해서 복사한 걸 -> arr2[0]부터 시작해서 arr.length까지 복붙!
		
		System.out.println(Arrays.toString(arr2));
		
		String msg = "korea";
		char[] ch = msg.toCharArray(); //
		System.out.println(Arrays.toString(ch));
		
		
	}

}
