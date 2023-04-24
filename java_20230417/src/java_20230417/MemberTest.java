package java_20230417;
class Member{
	String name;
	String id;
	String password;
	int age;
	
	boolean login(String id, String password) {
		if(id.equals("hong")&&password.equals("12345"))return true;
		else return false; }
	
	
	void logout(String id) {
		System.out.println("id :"+id+"님이 로그아웃");
	}
	
public class MemberTest {

	public static void main(String[] args) {
		Member user1 = new Member();
		boolean a= user1.login("hong","12345");
		if(a==true)
			System.out.println("로그인 성공");
		else
			System.out.println("로그인 실패");
		
		boolean b=user1.login("wdq", "123");
		
		if(b==true)
			System.out.println("로그인 성공");
		else
			System.out.println("로그인 실패");
		user1.logout("hong");
	}

	}

}
