package kiosk1;

import java.util.ArrayList;
import java.util.Scanner;
//저장공간을 만들어서 찍는 역할을 하는 건 매니저
public class ProductManager implements ProductInterface {
	//메뉴판을 저장하기 위한 공간
	private ArrayList<Product> menu = new ArrayList<>(); //메뉴 가격
	//주문내역을 저장하기 위한 공간 
	private ArrayList<Order> order = new ArrayList<>(); //메뉴 가격 개수 총합
	
	public void addMenu() {
		//기본메뉴 구성
//		Product p = new Product("햄버거", 5000); //Product = 한개의 메뉴를 생성하는 클래스
//		menu.add(p); //Product의 객체가 들어가야 함. menu,price가 들어감
		menu.add(new Product("햄버거", 5000)); //new로 객체 생성해야 함
		menu.add(new Product("피자", 15000)); 
		menu.add(new Product("음료", 2000)); 
		menu.add(new Product("사탕", 500)); 
		menu.add(new Product("과자", 1000)); 
	}
	
	@Override
	public void add(Scanner scan) {
		//메뉴추가
		//객체는 하나의 메뉴당 한객체 필요
		System.out.println("--메뉴추가--");
		System.out.print("메뉴명 > ");
		String pro = scan.next(); //menu라고 쓰고 싶으면
		System.out.print("가격 > ");
		int pri = scan.nextInt();
		
		menu.add(new Product(pro,pri)); //this.menu로 불러와야 함
	}

	@Override
	public void delete(Scanner scan) {
		//메뉴삭제 => 입력한 메뉴가 어디에 있는지 찾아서 삭제
		//list.remove(index), list.remove(Object)
		System.out.println("--메뉴삭제--");
		System.out.print("메뉴명 > ");
		String pro = scan.next();
		
		//제대로 입력시
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(pro)) {
				menu.remove(i);
				System.out.println("삭제되었습니다.");
				return;
			}
		}
		//메뉴명 잘못 입력시
		System.out.println("없는 메뉴입니다.");
	}

	@Override
	public void update(Scanner scan) {
		//가격수정
		//수정할 메뉴를 받아서 해당 메뉴의 객체를 set
		System.out.println("--메뉴수정--");
		System.out.print("메뉴명 > ");
		String pro = scan.next();
		System.out.print("가격 > ");
		int pri = scan.nextInt();
		
		//제대로 입력시
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(pro)) {
				//가격만 수정
				menu.get(i).setPrice(pri);
				//메뉴와 가격을 둘 다 수정
				//menu.set(i, new Product(pro, pri));
				System.out.println("수정 완료");
				return;
			}
		}
		//메뉴명 잘못 입력시
		System.out.println("없는 메뉴입니다.");
		
	}

	@Override
	public void orderPick(String name, int count) {
		//주문 => 매개변수로 값을 받을 경우
		//메뉴와 수량을 입력받아 orderList에 추가(new Order())
		//메뉴에 해당하는 price가 없는 상태 => menuList에서 구해와야 함.
		Order od = new Order();
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(name)) {
				od.setMenu(name);
				od.setPrice(menu.get(i).getPrice());
				od.setCount(count);
				od.setTotal(menu.get(i).getPrice()*count);
				order.add(od);
//				order.add(new Order(name, menu.get(i).getPrice(), count));
				od.print();
				return;
			}
//			선생님 풀이
//			int index = -1;
//			for(int i=0; i<menu.size(); i++) {
//				if(menu.get(i).getMenu().equals(name)) {
//					index = i; //없는 메뉴 입력했을경우 체크 용
//					int price = menu.get(i).getPrice();
//					Order tmp = new Order(name, price, count);
//					//tmp.setTotal(price*count); //생성자에 없다면...
//					order.add(tmp);
//					return;
//				}
//			}
//			if(index == -1) {
//				System.out.println("없는 메뉴 입니다.");
//			}
		}
		//메뉴명 잘못 입력시
		System.out.println("없는 메뉴입니다.");
		
	}
	
	@Override
	public void printOrder() {
		//주문내역 출력
		System.out.println("--주문내역--");
		int sum = 0;
//		for(int i=0; i<order.size(); i++) {
//			System.out.println(order.get(i).getMenu()+" : "+order.get(i).getCount()+"개");
//			sum += order.get(i).getTotal();
//		}
		for(Order o : order) {
			sum += o.getTotal(); //총합계 구하기
			o.print();
		}
		System.out.println("-----------");
		System.out.println("총 주문 금액 : "+sum);
	}

	
	@Override
	public void printProduct() {
		//메뉴 출력
		System.out.println("--menu--");
		for(Product p : menu) {
			System.out.println(p.toString()); //p객체의 toString 호출 toString 생략 가능
		}
		
	}
	
	//getter/setter
	public ArrayList<Product> getMenu() {
		return menu;
	}

	public void setMenu(ArrayList<Product> menu) {
		this.menu = menu;
	}

	public ArrayList<Order> getOrder() {
		return order;
	}

	public void setOrder(ArrayList<Order> order) {
		this.order = order;
	}
	
	
}
