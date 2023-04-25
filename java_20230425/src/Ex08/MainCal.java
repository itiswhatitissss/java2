package Ex08;

public class MainCal{ 

	public static void main(String[] args) {
		Calculable cal = new Add();
		cal.calculate(4, 3);
		
		cal = new Sub();
		cal.calculate(1, 4);
		


	}

}
