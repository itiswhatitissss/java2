package Ex01;
//인터페이스 선언
public interface Interface {
	//상수(public static final 생략 가능)
	public static final int MAX_VALUM=10;
	int MIN_VALUM=0;
	
	//추상메소드 --> body가 없는 게 특징임
	public void turnon();
	public void turnoff();
	
	//디폴트메소드 구현을 해도 되고 안해도 됨 --> 인터페이스에서 사용
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("무음처리");
		else
			System.out.println("무음해제");
	}
	
	//정적메소드 (public 붙 안붙 상관없음)
	static void  changebattery() {
		System.out.println("건전지 교체");
	}
	}

