package ex01;

import java.util.*;

public class Homework {

	public static void main(String[] args) {
		boolean bo;
		char ch = 0;
      	//4-1
      	//1.
      	int xx=10;
      	if(10<xx && xx<20)
      		bo= true;
      	//2.
        if(ch!=' ' &&ch!='	')
           bo= true;
        //3.
        if(ch=='x' &&ch=='X')
           bo= true;
        //4.
        if(0<=Character.getNumericValue(ch) && Character.getNumericValue(ch)<10)
           bo=true;
        //5.
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
           bo=true;
        //6. 
        int year=350;
        if(year%400==0||(year%4==0 && year%100 !=0))
           bo=true;
        
        //7.
        boolean powerOn;
        if(powerOn=false)
           bo=true;
        //8. 
        String str="yes";
        if(str.equals("yes"))
           bo=true;
        
        //4-2. 
        System.out.println();
        System.out.println("4-2번 출력결과");
        
        int total = 0;
        for(int i=1;i<=20;i++) {//1~20까지의 정수
           if(i%2!=0||i%3!=0)   //2와 3의 배수가 아닌것
              total+=i;      //총합
        }
        System.out.println(total);
        
        //4-3
        System.out.println();
        System.out.println("4-3번 출력결과");
        
        int total2=0;               
        int total3=0;               
        for(int i=1;i<11;i++) {      //1~10까지 반복
           for(int j=1;j<=i;j++) {   //이중for문 i가 1일떄 1번, 2일때 2번.. i의 횟수만큼 j반복
              total2+=j;         //1부터 i까지의 합
           }                  
           total3+=total2;         //j의 총합
        }
        System.out.println(total3);
        
        //4-4
        System.out.println();
        System.out.println("4-4번 출력결과");
        
        int total4=0;               //총합
        int num;                  //더할 숫자
        int cnt=0;                  //100 이상이 될 때의 넘의 숫자
        for(num=1;total4<100 ;num++) {   //
           if(num%2==1)            //num이 홀수이면 총합에 num을 더하고
              total4+=num;         
           else                  //num이 짝수이면 총합에 num을 뺀다
              total4-=num;
           
           cnt++;
        }
        System.out.println(cnt);
        
        //4-5
        System.out.println();
        System.out.println("4-5번 출력결과");
        
        int a=0;                  //i를 a로 바꿔 씀
        while( a<=10) {               //a가 10이하 일때 반복
           int b=0;               //b는 j이고 while(b<=a)가 시작하기 전에 b를 초기화
           while(b<=a) {            //b의 값이 a가 될 때까지 a번 반복
              System.out.print("*");   
              System.out.println();   
              b++;               
           }
           a++;
        }
        //4-6
        System.out.println();
        System.out.println("4-6번 출력결과");
        
        for(int i=1;i<=6;i++) {         //첫 번째 주사위 값
           for(int j=1;j<=6;j++) {      //두 번째 주사위 값
              if(i+j==6)
                 System.out.println("첫 번째 주사위 값이 "+i+", 두 번째 주사위 값이 "+j+"이면 눈의 합이 6이 된다");
           }
        }

		//4-7
        System.out.println();
		System.out.println("4-7번 출력결과");
		int value = (int)(Math.random()*6)+1;
		System.err.println("value: "+value);
		
		//4-8
		System.out.println();
		System.out.println("4-8번 출력결과");
		
		int x;
		int y;
		
		for(x=0;x<=5;x++) {
			for(y=0;y<3;y++)
				if(2*x+4*y==10)
			System.out.println("x="+x+" "+"y="+y);
		}
		
		//4-9
		System.out.println();
		System.out.println("4-9번 출력결과");
		
		String str1 = "12345";
		int sum = 0;
		
		for(int i=0;i<str1.length();i++) {
			sum+=Integer.parseInt(Character.toString(str1.charAt(i)));//문자열로 변경후 parseInt..
		}
		System.out.println(sum);
	
		//4-10
		System.out.println();
		System.out.println("4-10번 출력결과");
		
		int numm = 123456;
		int summ = 0;
		
		while(numm!=0) {
			int remain = numm % 10;
			summ+=remain;
			numm/=10;
		}
		
		System.out.println("sum="+summ);
		
		
		
		//4-11
		System.out.println();
		System.out.println("4-11번 출력결과");
		
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		System.out.print(num1+","+num2+",");
		
		for(int i=0; i<8; i++) {
			num3=num1+num2;
			System.out.print(num3+", ");
			num1=num2;
			num2=num3;
		}
		
		//4-12
		System.out.println();
		System.out.println("4-12번 출력결과");
		
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=3;j++)
				System.out.println(i+"*"+j+"="+(i*j));
		}
		
		
		//4-13
		System.out.println();
		System.out.println("4-13번 출력결과");
		
		String value1 = "123o4";
		char chh = ' ';
		boolean isNumber = true;
		
		for(int i=0;i<value1.length();i++) {
			char tmp=value1.charAt(i);
			if(Character.isDigit(tmp)==false) { //isDigit 문자열이 숫자로 구성되어 있는지 판별해주는 함수, 음수나 소수점이 있을 경우에는 숫자임에도 false 리턴
				isNumber=false;
			}
		}
		
		if(isNumber) {
			System.out.println(value1+"는 숫자입니다");
		}else {
			System.out.println(value1+"는 숫자가 아닙니다");
		}
		
		
		//4-14
		System.out.println();
		System.out.println("4-14번 출력결과");
		
		int answer = (int)(Math.random()*100)+1;
		int input=0;
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1과 100사이의 값을 입력하세요 :");
		
		do {
			count++;
			input = sc.nextInt();
			
			if(input<answer)
				System.out.println("더 큰 수를 입력하세요");
			else if(input>answer)
				System.out.println("더 작은 수를 입력하세요");
			else if(input==answer) {
				System.out.println("정답입니다");
				System.out.println("시도횟수는"+count+"번입니다");
				break;
			}
		}while(true);
		
		//4-15
		System.out.println();
		System.out.println("4-15번 출력결과");
		
		int number = 12321;
		int tmp = number;
		
		int result = 0;
		
		while(tmp!=0) {
			 int remainder = tmp % 10;
			    result = result * 10 + remainder;
			    tmp /= 10;
		}
		
		if (result == number) {
		    System.out.println(number + "는 회문수입니다.");
		} else {
		    System.out.println(number + "는 회문수가 아닙니다.");
		}
		
		
			
		
		
		
		
	}
}

