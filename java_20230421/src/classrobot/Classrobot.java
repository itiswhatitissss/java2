package classrobot;

public class Classrobot {
	static void action(robot r) {
		if(r instanceof dancerobot) {
			dancerobot d = (dancerobot)r;
			d.dance();
		}else if(r instanceof singrobot) {
			singrobot s = (singrobot)r;
			s.sing();
		}else if(r instanceof drawrobot) {
			drawrobot dr = (drawrobot)r;
			dr.draw();
		}
	}

	public static void main(String[] args) {
		robot[] arr = {new dancerobot(), new singrobot(), new drawrobot()};
		for(int i=0;i<arr.length;i++)
			action(arr[i]);
	}

}
class robot {}

class dancerobot extends robot{
	static void dance() {
		System.out.println("춤을춘다");
	}
}
class singrobot extends robot{
	static void sing() {
		System.out.println("노래를 한다");
	}
}
class drawrobot extends robot{
	static void draw() {
		System.out.println("그림을 그린다");
	}
}