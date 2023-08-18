package Day03;

import java.util.Scanner;

public class Switch문02 {

	public static void main(String[] args) {
		/* 숙제 (클럽에 제출)
		 * 정수 2개와 연산자 하나를 입력받아 두 정수의 연산을 출력
		 * 연산자는 + - *  / % 중 하나를 입력받기
		 * ex) 3 2 + => 3 + 2 = 5
		 * ex) 3 2 - => 3 - 2 = 1
		 * ex) 3 2 * => 3 * 2 = 6
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 2개를 입력하십시오.");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("연산자 하나를 입력하십시오.");
		char ch = scan.next().charAt(0); //0번지의 값을 떼서 한글자만 받음
		
		/* 숫자 = 그냥 입력 int num = 3;
		 * char (한글자) '' 값을 입력받음.
		 * string (문자열) "" 값을 입력받음.
		 * */
		switch(ch) {
		case '+': System.out.println(a+"+"+b+"="+(a+b)); break;
		case '-': System.out.println(a+"-"+b+"="+(a-b)); break;
		case '*': System.out.println(a+"*"+b+"="+(a*b)); break;
		case '/': System.out.println(a+"/"+b+"="+(a/b)); break;
		case '%': System.out.println(a+"%"+b+"="+(a%b)); break;
			default: System.out.println("잘못된 입력값입니다."); break;
		}
		// + : 더하기 / 연결연산자 (피연산자가 문자일 경우)
		// 3 + 5 = 8 => 의미 없는 문자를 삽입하여 연산이 되지 않게 해야 함. 
//		System.out.println(num1+""+op+num2+"="+result);
		scan.close();
		
	}

}
