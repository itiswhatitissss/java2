package ex4;

public class Exam07 {
//1+(-2)+3+(-4)+...이런 식으로 더해 나갈 때, 몇 까지 더해야 총합이 100이상 될까?
	
	public static void main(String[] args) {
		
		int sum = 0;
		int i;
		
		for(i=0; ;i++) {
			if(i%2==1)
				sum+=i;
			else
				sum-=i;
			if(sum >= 100) break;	
		}
		
	System.out.println(i);
	System.out.println(sum);
	}
}