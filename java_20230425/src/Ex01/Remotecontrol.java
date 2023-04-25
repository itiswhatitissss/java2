package Ex01;

public class Remotecontrol {
	public static void main(String[] args) {
		Interface rc = new Television();
		rc.turnon();
		rc.turnoff();
		
		Interface ac = new Audio();
		ac.turnon();
		ac.turnoff();
		Interface.changebattery();
		
		
		Searchable se = new Audio();
		se.search("^^^^");
		System.out.println(Interface.MIN_VALUM);
	}
}
