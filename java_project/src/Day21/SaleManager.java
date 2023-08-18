package Day21;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {

	//Sale 클래스의 처리를 위한 클래스
	private ArrayList<Sale_Generic<String, Integer>> menu = new ArrayList<>(); 
	private ArrayList<Sale_Generic<String, Integer>> order = new ArrayList<>(); 
	
	//메뉴
	public void printMenu() {
		System.out.println(">>menu<<");
		System.out.println("1.제품추가|2.제품리스트보기|3.제품주문");
		System.out.println("4.주문내역보기|5.종료");
		System.out.print(">> menu :");
	}
	
	//제품추가
	public void add(Scanner scan) {
		String menu = null;
		int price = 0;
		System.out.print("제품명 : ");
		menu = scan.next();
		System.out.print("가격 : ");
		price = scan.nextInt();
		
		//클래스 객체 생성한 후 add
		Sale_Generic<String, Integer> p = new Sale_Generic<>(menu, price); //<>추가
		this.menu.add(p); //멤버변수와 선언변수의 이름이 같다면 멤버변수에 this를 붙여줘야한다.
		
	}

	//제품리스트보기
	public void menu() {
		for(Sale_Generic<String, Integer> tmp : menu) { //<>추가
			System.out.println(tmp); //toString 반영하여 출력
		}
	}

	//주문하기
	//name = 주문음식, count = 주문수량
	public void orderPick(String name, int count) {
		for(int i=0; i<menu.size(); i++) {
			String productMenu = menu.get(i).getMenu(); //주문메뉴 , 메뉴는 타입이 정해져있기 때문에 앞에 타입을 적지 않아도 됨
			int productPrice = menu.get(i).getPrice(); //주문가격
			if(productMenu.equals(name)) {
				Sale_Generic p = new Sale_Generic(productMenu, productPrice*count); //<>추가X
				order.add(p);
			}
			
		}
		
	}

	//주문내역출력
	public void printOrder() {
		int sum = 0;
		for(Sale_Generic tmp : order) {
			System.out.println(tmp); //toString 반영하여 출력
			sum += (Integer)tmp.getPrice(); //tmp는 타입이 없기 때문에 앞에 타입을 적어줘야 함
			//제네릭 타입의 멤버 값으로 직접 접근하게 되면 형변환 후 저장해야 함. -> (Integer)tmp.getPrice();
		}
		System.out.println("총 지불 금액 : "+sum);
	}
	
	
	
}
