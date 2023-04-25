package Ex01;

public class Television implements Interface{

	@Override
	public void turnon() {
		System.out.println("Tv를켭니다");
		
	}

	@Override
	public void turnoff() {
		System.out.println("Tv를 끕니다");
	}

		
}
