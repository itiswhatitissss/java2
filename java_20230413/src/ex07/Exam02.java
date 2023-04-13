package ex07;

import java.util.Arrays;

public class Exam02 {
public static void main(String[] args) {
	
	int[] n = new int[5];
	
	int[][]num = new int[4][3];
	num[2][1]=100;
	
	int[][]num2= {
			{1,2,3,3},
			{4,5,6,6,5,4,6,5},
			{7,8,9,8,4,5,7,3,2,3,5},
			{7,8,9,8,4,5,7,3,2,3,5}
	};
	for(int i=0;i<3;i++) {
		for(int j=0;j<num2[i].length;j++)
			System.out.print(num2[i][j]+"\t");
		System.err.println();
		System.out.println(num2.length);
	}
	
	final int NUM = 4;
	int[][] mtx = new int[NUM][NUM];
	
	for(int i=0;i<NUM;i++) {
		mtx[i][i]=i+1;
	
	System.out.println(Arrays.toString(mtx[i]));}
}
}
