package kiosk1;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		ProductManager pm = new ProductManager();
		Scanner scan = new Scanner(System.in);
		
		pm.addMenu(); // 기본 메뉴 구성
		int menu = 0;
		
		do {
			System.out.println(">> 버튼 선택");
			System.out.println("1.메뉴추가|2.메뉴수정|3.메뉴삭제");
			System.out.println("4.메뉴리스트|5.주문|6.주문내역");
			System.out.print("7.종료| 선택 >> ");
			
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: pm.add(scan); break;
			case 2: pm.update(scan); break;
			case 3: pm.delete(scan); break;
			case 4: pm.printProduct(); break;
			case 5: 
				System.out.print("주문메뉴 > ");
				String name = scan.next();
				System.out.print("개수 > ");
				int count = scan.nextInt();
				pm.orderPick(name, count);
				break;
			case 6: pm.printOrder(); break;
			case 7: break;
			default : 
				System.out.println("잘못된 메뉴입니다.");
			}
			System.out.println();
			
		}while(menu != 7);
		System.out.println("프로그램 종료");
		
	}

}
