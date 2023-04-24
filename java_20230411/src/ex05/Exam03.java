package ex05;

//    +
//   ++
//  +++
// ++++
//+++++

public class Exam03 {

	public static void main(String[] args) {
		
		for(int i=5;i!=0;i--) {
			for(int j=0;j<i;j++) 
				System.out.print(" ");
			for(int k=6;k>i;k--)
				System.out.print("+");
			System.out.println();}
		
		
		for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
				if(j<4-i)
					System.out.print(" ");
				else
					System.out.print("+");
			}
			System.out.println();
		}

		
}}
