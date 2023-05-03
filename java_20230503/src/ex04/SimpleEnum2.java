package ex04;
enum AA{
	DOG,CAt
}
enum Person{
	MAN,WOMAN
}

public class SimpleEnum2 {

	public static void main(String[] args) {
		who(Person.MAN.ordinal());
	}
	public static void who(int p) {
		switch(p) {
		case 0 :
			System.out.println("남성");
			break;
		case 1 : 
			System.out.println("여성");
			break;
		}
	}
}
