package kiosk;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 키오스크 확장판
		 * 
		 * --메뉴판--
		 * 1 피자 15000
		 * 2 햄버거 1000
		 * 3 콜라 2000
		 * 4 아이스크림 500
		 * 
		 * 주문하시겠습니까?
		 * 피자 2개 주문
		 * 콜라 2개 주문
		 * 계산하기
		 * 15000*2=30000
		 * 2000*2=4000
		 * 총 지불금액 34000원입니다.
		 * 
		 * --메뉴추가 : 메뉴판에 메뉴를 추가할 수 있음
		 * --메뉴삭제 : 메뉴판에 메뉴를 삭제할 수 있음
		 * --가격변경 : 기존 메뉴의 가격을 변경
		 * --계산 : 주문한 금액을 계산하여 총 지불금액을 확인,리턴
		 * 
		 * -메뉴-
		 * 1. 주문하기
		 * 2. 메뉴추가
		 * 3. 메뉴삭제
		 * 4. 가격변경
		 * 5. 종료
		 * 
		 * 1.주문하기 => 메뉴 보여주고, 주문받기(while) => 주문완료 => 금액계산
		 * 
		 * */ 
		MenuManager m = new MenuManager();
		Scanner scan = new Scanner(System.in);
		int menu =0 ;

		do {
			m.menuPrint(); //메뉴판
			
			System.out.println("--------");
			System.out.println("1.주문하기");
			System.out.println("2.메뉴추가");
			System.out.println("3.메뉴삭제");
			System.out.println("4.가격변경");
			System.out.println("5.종료");
			System.out.print("메뉴 선택 > ");
			menu = scan.nextInt();
			System.out.println(); //줄바꿈
			
			
			switch(menu) {
			case 1 : m.orderMenu(scan); break;
			case 2 : m.insertMenu(scan); break;
			case 3 : m.deleteMenu(scan); break;
			case 4 : m.changePrice(scan); break;
			case 5 : System.out.println("종료합니다."); break;
			default : System.out.println("잘못된 메뉴 선택입니다.");
			}
			System.out.println(); //줄바꿈
			
		}while(menu != 5);
	
	}

	
}
