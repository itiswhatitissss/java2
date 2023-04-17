package java_20230417;

class student{
	String name;
	String address;
	int age;
	static int count; //공유변수로써 이렇게 따로 지정해주면 count가 된다 (static이 붙으면 모든 객체의 동일자원으로 인식하면 됨)
	
	void displyInfo() {
		count++;
		//info();  void dsplyInfo()는 객체가 생성이 되야 생기는 메소드로 11번 식은 오류가 나지 않음
		System.out.println(name+","+age+","
	+address+"현재 학생수 : "+count);
	}
	
	static void info() {
		count++;
		//displyInfo();  static void info()는 객체가 생성되기 전 부터 메쏘드 영역에 올라가는 식으로 18번 문장은 오류가 난다. 
	}
}
public class StudentTest {

	public static void main(String[] args) {
		
			
			
			
		student kim = new student();
		kim.name="김씨요";
		kim.age=20;
		kim.address="수원이요";

		student park = new student();
		park.name="박씨요";
		park.age=23;
		park.address="서울이요";
		
		student lee = new student();
		student hong = new student();
		
		kim.displyInfo();
		park.displyInfo();
		lee.displyInfo();
		hong.displyInfo();
	}

}
