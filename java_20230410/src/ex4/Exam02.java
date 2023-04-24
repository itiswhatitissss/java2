package ex4;

public class Exam02 {

	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2==0 && i%3==0) {
				System.out.print(i + ", ");
				count++;} //if문을 중괄호로 묶어줘서 if가 실행됐을 떄 count까지 같이 시행 될 수 있게 해준다!!!
		}
					System.out.println("\n"+count);
	}
}
