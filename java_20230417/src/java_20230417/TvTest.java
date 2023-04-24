package java_20230417;
class Tv{
	String color;
	boolean power;
	int channel;
	
	//method
	void power() {power=!power;}
	void channelup() {channel++;}
	void channeldown() {channel--;}
}

public class TvTest {

	public static void main(String[] args) {
		
		Tv tv = new Tv(); //사전에 정의한 method를 머금은 객체 생성 (heap에 저장되는 친구)
		int num = 10;
		int kor = 90;
		tv.color = "검정";
		tv.channelup();
		tv.channelup();
		System.out.println(tv.color);
		System.out.println(tv.channel);
		
		Tv lgtv = new Tv(); //16번 tv랑은 다른 사전에 정의한 method를 머금은 객체 (heap에 저장되는 친구)
		lgtv.color = "흰색";
		System.out.println(lgtv.color);
		System.out.println(lgtv.channel);
		
		
		
		
		
		
	}
}
