package ex06;

import java.util.Arrays;

public class practice {

	public static void main(String[] args) {
		final int num = 10;
		int[] arr = new int[num];
		
		//총점 평균
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
			sum += arr[i];}
		System.out.println(Arrays.toString(arr));
		System.out.println("총점 : "+ sum);
		System.out.println("평균 : "+ sum/(double)num);
		
		//최대값, 최소값
		Arrays.sort(arr);
		System.out.println("최대값 : "+arr[0]);
		System.out.println("최대값 : "+arr[arr.length-1]);
		
		//오름차순 정렬
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;}
			}
		}
		System.out.print(Arrays.toString(arr));
		System.out.println();
			
		
	}

}
