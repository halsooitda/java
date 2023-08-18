package Day21;

import java.util.Scanner;

public class Generics01 {

	public static void main(String[] args) {
		/* 제네릭(Generics) : 데이터 타입을 나중에 확정하는 기법
		 * 클래스나 메서드를 선언할 때 어떤 데이터가 들어올지 확신이 없다면,
		 * 제네릭 타입으로 나중에 확정할 수 있음.
		 * 나중에 구현시(객체 생성시) 타입을 넣어 구현하면 됨.
		 * 
		 * 객체의 타입을 컴파일 할 때 체크할 수 있어서 타입의 안정성을 해치지 않는 선에서
		 * 적당히 형변환이 가능한 기법.
		 * 타입 안정성
		 * - 의도하지 않은 타입의 객체가 저장되는 것을 막는다.
		 * - 저장된 객체를 꺼내올 때 다른 타입으로 잘못 형변환 되는 것을 막아 오류를 줄인다.
		 * */
		
		//Sale class 실행을 위한 main
		//1.제품추가|2.제품리스트보기|3.제품주문"
		//4.주문내역보기|5.종료
		
		Scanner scan = new Scanner(System.in);
		SaleManager sm = new SaleManager();
		
		int menu = -1;
		do {
			sm.printMenu(); //메뉴
			menu = scan.nextInt();
			
			switch(menu) {
			case 1 : sm.add(scan); break; //메인에서 만들어서 역으로 집어넣는다!
			case 2 : sm.menu(); break;
			case 3 : 
				System.out.print("주문메뉴 > ");
				String name = scan.next();
				System.out.print("수량 > ");
				int count = scan.nextInt();
				sm.orderPick(name, count); break;
			case 4 : sm.printOrder(); break;
			case 5 : break;
			default :
				System.out.println("잘못된 메뉴입니다.");
			}
			System.out.println(); //줄바꿈
			
		}while(menu != 5);
		System.out.println("프로그램 종료");
		
		
		
	}

}
