package Ex05;

//중첩인터페이스 : 해당클래스와 밀접한 관계를 맺는 구현 객체를 만들기 위해서이다.
public class Button {
	
	public static interface ClickListener{
		void onClick();
	}
	
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener=clickListener;
	}
	public void click() { //버튼이 클릭되었을 때 실행되는 메소드 선언
		this.clickListener.onClick();
	}

}
