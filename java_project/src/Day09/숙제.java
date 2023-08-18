package Day09;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		/* 계산기 만들기
		 * --메뉴--
		 * 1.덧셈|2.뺄셈|3.곱셈|4.나눗셈|5.나머지|6.종료
		 * >> 메뉴선택 1
		 * >> 숫자1> 입력받기(5)
		 * >> 숫자2> 입력받기(3)
		 * 결과 : 5+3=8
		 * 더하기 메서드를 호출하여 연산 (5+3)
		 * 
		 * 연산에 따른 switch 구문으로 메서드 호출
		 * */ 
		Scanner scan = new Scanner(System.in);
		int menu; // 미리 선언 안 하면 while에서 사용불가
		
		do {
			System.out.println("--메뉴--");
			System.out.println("1.덧셈");
			System.out.println("2.뺄셈");
			System.out.println("3.곱셈");
			System.out.println("4.나눗셈");
			System.out.println("5.나머지");
			System.out.println("6.종료");
			System.out.println("-------");
			
			System.out.print("메뉴선택 >> ");
			menu = scan.nextInt();
			if(menu==6) {
				System.out.println("종료합니다.");
				break;
			} else if(menu<1 || menu>6) {
				System.out.println("잘못된 메뉴 선택입니다. 다시 선택하십시오.");
				continue;
			}
			System.out.print("숫자1 >> ");
			int num1 = scan.nextInt();
			System.out.print("숫자2 >> ");
			int num2 = scan.nextInt();
			
			switch(menu) {
			case 1: 
				System.out.println(num1+"+"+num2+"="+sum(num1,num2));
				break;
			case 2:
				System.out.println(num1+"-"+num2+"="+sub(num1,num2));
				break;
			case 3:
				System.out.println(num1+"*"+num2+"="+mul(num1,num2));
				break;
			case 4:
				System.out.println(num1+"/"+num2+"="+div(num1,num2));
				break;
			case 5:
				System.out.println(num1+"%"+num2+"="+mod(num1,num2));
				break;
			default: 
				System.out.println("잘못된 메뉴선택입니다."); 
				break;
			}
		}while(menu!=6);
	}
	

	/* 더하기, 빼기, 곱하기, 나누기, 나머지 메서드를 별도 구성
	 * */
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	public static int div(int num1, int num2) {
		return num1 / num2;
	}
	
	public static int mod(int num1, int num2) {
		return num1 % num2;
	}
	
	
}
