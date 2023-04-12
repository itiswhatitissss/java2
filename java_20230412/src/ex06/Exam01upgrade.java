package ex06;
import java.util.*;

/*조원 3명의 점수를 입력받아서
자바점수 배점은 랜덤함수 이용해서 50~100값이 저장되도록 한다
조원 총점, 평균을 출력한다*/

public class Exam01upgrade {

	public static void main(String[] args) {
		
		final int A = 5; //상수로 두기 때문에 final을 써주는 게 좋음
		
		int sum = 0;
		double avg = 0;
		int[] team = new int[A];
		
		for(int i=0;i<A;i++) {
			team[i] = (int)(Math.random()*50)+51;
		}
		
		for(int i=0;i<A;i++)
			sum+=team[i];
		
		avg=sum/A;
		
		System.out.println(Arrays.toString(team));
		System.out.println("\n"+sum+", "+avg);
		
		
		
	}

}
