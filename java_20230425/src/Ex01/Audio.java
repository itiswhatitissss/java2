package Ex01;

public class Audio implements Interface,Searchable {

	@Override
	public void turnon() {
		System.out.println("오디오를 켭니다");
	}

	@Override
	public void turnoff() {
		System.out.println("오디오를 끕니다");
	}

	@Override
	public void search(String url) {
		System.out.println(url+"를 검색합니다");
	}
	
	//setMute함수 재정의할 때 앞에 default를 public으로 수정해주면 됨
//	public void setMute(boolean mute) {
//		System.out.println("seMute 재정의");
//	}

}
