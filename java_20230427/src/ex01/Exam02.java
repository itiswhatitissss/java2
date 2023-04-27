package ex01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam02 {

	public static void main(String[] args) {
		
		String str = "1234567890";
		Pattern p = Pattern.compile("^[0-9]*$"); //숫자
		Matcher m = p.matcher(str);
		System.out.println(m.find());
		
		String str2 = "123456";
		Pattern p2 = Pattern.compile("^[0-9A-Z]{6}$");
		Matcher m2 = p.matcher(str2);
		System.out.println(m2.find());
	
		String str3 = "aaa111@1111.com";
		Pattern p3 = Pattern.compile("[\\w]*@[\\w]*.com$");
		Matcher m3 = p.matcher(str3);
		System.out.println(m2.find());
		
	}                

}
