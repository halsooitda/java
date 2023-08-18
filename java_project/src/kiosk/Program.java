package kiosk;

import java.util.Scanner;

public interface Program {
	void menuPrint();
	void orderMenu(Scanner scan); // 주문하기
	void insertMenu(Scanner scan); // 메뉴추가
	void deleteMenu(Scanner scan); // 메뉴삭제
	void changePrice(Scanner scan); // 가격변경
}
