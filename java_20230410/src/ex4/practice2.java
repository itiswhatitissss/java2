package ex4;
//1 -2 +3 -4 +5... 합이 100이 되는 경우
public class practice2 {

	public static void main(String[] args) {
		int num  = 0;
		int i;
		
		for(i=0;true;i++) {
			if(i%2==1)
				num+=i;
			else
				num-=i;
			if(num>=100)break;}
		System.out.println(i);
		System.out.println(num);
	}
}
