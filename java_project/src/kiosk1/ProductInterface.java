package kiosk1;

import java.util.Scanner;

public interface ProductInterface { //기능에 대한 정리
	
	//메뉴추가, 메뉴삭제, 메뉴수정-가격수정, 주문, 주문내역 출력, 메뉴출력
	void add(Scanner scan);
	void delete(Scanner scan);
	void update(Scanner scan);
	void orderPick(String name, int count); // 주문
	void printOrder(); //주문내역출력
	void printProduct(); //메뉴출력
	
}
