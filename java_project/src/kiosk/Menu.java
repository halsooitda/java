package kiosk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

//1.주문하기 => 메뉴 보여주고, 주문받기(while) => 주문완료 => 금액계산
public class Menu {
	HashMap<String, Integer> menu = new HashMap<>(); //주문용
	HashMap<String, Integer> odrList = new HashMap<>(); //영수증용
	
	{
		menu.put("피자", 15000);
		menu.put("햄버거", 5000);
		menu.put("콜라", 2000);
		menu.put("아이스크림", 1000);
	}
	
	//메뉴 목록 출력
	public void mPrint() {
		Iterator<String> it = menu.keySet().iterator();
		System.out.println("--메뉴판--");
		while(it.hasNext()) {
			String pro = it.next();
			int pri = menu.get(pro);
			System.out.println(pro+" "+pri);
		}
	}
	
	//주문받기
	public void mOrder(Scanner scan) {
		int sum = 0;
		String product;
		
		while(true) {
			System.out.print("주문하실 메뉴(주문 종료:0) > ");
			product = scan.next();
			
			//주문 취소
			if(product.equals("0")) {
				break;
			}
			
			//메뉴명 잘못 입력시
			if(!(menu.keySet().contains(product))) {
				System.out.println("없는 메뉴입니다.");
				break;
			}
			
			System.out.print("개수 > ");
			int num = scan.nextInt();
			
			if(menu.keySet().contains(product)) {
				System.out.println(product+" 가격 : "+menu.get(product)*num+"원");
				sum += menu.get(product)*num;
				odrList.put(product, menu.get(product)*num); //주문리스트 넣어주기
			}
		}
		if(product.equals("0")) {
			System.out.println("--영수증--");
			for(String key : odrList.keySet()) {
				System.out.println(key+":"+odrList.get(key));
			}
			System.out.println("==총 지불금액 : "+sum+"원==");
		}
		
		
	}
	
	
}
