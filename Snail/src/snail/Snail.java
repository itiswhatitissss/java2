package snail;

import java.util.Arrays;

public class Snail {

	public static void main(String[] args) {
		int size = 5;
		int[][] map = new int [5][5];
		int num = 1;
		int a = 0; //왼쪽 모서리 값 0
		int b = size-1; //오른쪽 모서리 값 4
 		
		for(int i=0;i<size/2;i++) {
			for(int j=a;j<=b;j++) {   //a
				map[a][j] =num;
				num++;
			}
			for(int j=a+1; j<=b;j++) {//b
				map[j][b] = num;
				num++;
			}
			for(int j=b-1;j>=a;j--) { //c
				map[b][j]=num;
				num++;
			}
			for(int j=b-1;j>a;j--) {  //d
				map[j][a]=num;
				num++;
			}
			a++;
			b--;
		}
		map[size/2][size/2]=num;
		for(int i=0;i<map.length;i++) {
			System.out.println(Arrays.toString(map[i]));
			System.out.println(map[i].length);
		}
	}

}
