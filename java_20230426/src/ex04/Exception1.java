package ex04;

public class Exception1 {
	
	public static void main(String[] args) {
		
		String [] arr = {"100","kor","200"};
		for(int i=0;i<arr.length+1;i++) {
		try {
				int value = Integer.parseInt(arr[i]);
				System.out.println(value);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("배열 크기 봐라");
		}catch (NumberFormatException e){
			e.printStackTrace();
			System.out.println("정신 차리라");
//		}catch (Exception e) {
//			System.out.println("야호");
		}finally {
			System.out.println("^^");
		}
	}
		System.out.println("프로그램 종료");
	}}
		
	
