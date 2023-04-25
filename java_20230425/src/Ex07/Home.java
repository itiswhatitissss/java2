package Ex07;

public class Home {
	private RemoteControll rc = new RemoteControll() {
		
		@Override
		public void turnon() {
			System.out.println("^^");
		}
		
		@Override
		public void turnoff() {
			System.out.println("^.^");
		}
	};
	
	public void use1() {
		rc.turnon();
		rc.turnoff();
	}
	
	public void use2(RemoteControll rc) {
		rc.turnon();
		rc.turnoff();
	}
}
