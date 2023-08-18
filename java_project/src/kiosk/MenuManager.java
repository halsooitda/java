package kiosk;

import java.util.Scanner;

public class MenuManager implements Program {
	Menu m = new Menu();
	
	//메뉴판
	@Override
	public void menuPrint() {
		m.mPrint();
	}
	
	//주문하기
	@Override
	public void orderMenu(Scanner scan) { 
	 m.mOrder(scan);
	}
	
	//메뉴추가
	@Override
	public void insertMenu(Scanner scan) {
		System.out.println("--메뉴추가--");
		System.out.print("메뉴명 > ");
		String menu = scan.next();
		System.out.print("가격 > ");
		int price = scan.nextInt();
		
		m.menu.put(menu, price);
	}

	//메뉴삭제
	@Override
	public void deleteMenu(Scanner scan) {
		System.out.println("--메뉴삭제--");
		System.out.print("삭제할 메뉴 > ");
		String menu = scan.next();
		
		if(m.menu.keySet().contains(menu)) {
			m.menu.remove(menu);
		}else { //메뉴명 잘못 입력시
			System.out.println("없는 메뉴입니다.");
		}
	}
	
	//가격변경
	@Override
	public void changePrice(Scanner scan) {
		System.out.println("--가격변경--");
		System.out.print("가격을 변경할 메뉴 > ");
		String menu = scan.next();
		//메뉴명 잘못 입력시
		if(!(m.menu.keySet().contains(menu))) { 
			System.out.println("없는 메뉴입니다.");
			return;
		}
		System.out.print("변경 가격 > ");
		int price = scan.nextInt();
		
		if(m.menu.keySet().contains(menu)) {
			m.menu.put(menu, price);
		}
		
	}

}
