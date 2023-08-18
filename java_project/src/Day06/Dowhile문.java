package Day06;

import java.util.Scanner;

public class Dowhile문 {

	public static void main(String[] args) {
		/* do {
		 * 실행문;
		 * } while(조건식);
		 * 
		 * 실행문을 먼저 실행하고나서 조건식을 비교하여 반복을 결정하는 구문
		 * for문이나 while문은 조건식이 false면 한번도 실행이 안될 수도 있음
		 * 
		 * 메뉴 생성시 많이 사용
		 * */ 
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		do {
			System.out.println("---menu---");
			System.out.println("1.저장하기");
			System.out.println("2.새로만들기");
			System.out.println("3.종료하기");
			System.out.println("----------");
			System.out.println("메뉴를 입력해주세요.");
			menu = scan.nextInt();
			// 실제 기능 처리구문
			switch(menu) {
			case 1: System.out.println("저장합니다."); break;
			case 2: System.out.println("새로만들었습니다."); break;
			case 3: System.out.println("종료합니다."); break;
				default: System.out.println("잘못입력하셨습니다."); break;
			}
		}while(menu != 3); // true이면 계속 반복, 3이 아니면 계속 반복
		System.out.println("프로그램 종료");
		
		
		scan.close();
		

	}

}
