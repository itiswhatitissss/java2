package java_20230414;
//함수를 호출하면서 인자값 하나 전달(정수)하면 함수는 1부터 전달한 인자값까지 더해서 더한 결과값을 호출함수에게 반환해서 출력
public class FunctionExam04 {

	public static void main(String[] args) {
		int total = sumFunction(10);
		System.out.println(total);
		
		sumFunction2(15);
	}
	static int sumFunction(int num) {
		int result=0;
		for(int i=1;i<=num;i++)
			result += i;
		return result;
		
	}
	//
	static void sumFunction2(int num1) {
		int result=0;
		for(int i=1;i<=num1;i++)
			result += i;
		if(result%2==0)
			System.out.println("짝수"+result);
		else if(result%2==1)
			System.out.println("홀수"+result);
	}
}
