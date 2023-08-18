package Day15;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		/* main 
		 * Product 클래스를 이용 객체를 생성
		 * 상품등록[] => 여러개의 메뉴를 등록
		 * 메뉴는 스캐너를 통해 입력받아 등록
		 * 상품 등록 후 배열의 내용을 출력
		 * 
		 * ex)
		 * 상품을 등록하시겠습니까(y/n)? y
		 * y => 상품등록 반복 / n => 등록 그만
		 * 상품의 이름과 가격을 등록받아 상품 배열에 등록
		 * 
		 * n => 리스트 출력
		 * */
		
		Product[] menu = new Product[5];
		Scanner scan = new Scanner(System.in);
		
		int cnt = 0; 
		while(cnt < menu.length) { 
			System.out.println("상품을 등록하시겠습니까? (Y/N)");
			char answer = scan.next().charAt(0);
		
			if(answer=='y' || answer=='Y') {
				System.out.println("상품의 이름을 등록해주십시오.");
				String name = scan.next();
				System.out.println("상품의 가격을 등록해주십시오.");
				int price = scan.nextInt();
				Product p = new Product(); // 상품 정보를 넣어줄 객체 생성
				p.addProduct(name, price); 
				menu[cnt]= p; // 빈 배열에 상품정보가 들어간 객체를 넣어줌
				cnt++;
			}else if(answer=='n' || answer=='N') {
				System.out.println("상품 등록을 종료합니다.");
				System.out.println("---등록된 상품---");
				for(int i=0; i<cnt; i++) { // 등록된 상품 출력
					menu[i].printProduct();
				}
				break; // 출력하고 끝내기
			}
			if(cnt==5) { 
				System.out.println("---등록된 상품---");
				for(int i=0; i<cnt; i++) { // 등록된 상품 출력 , cnt=length
					menu[i].printProduct();
				}
			}
		}
		
		
	}

}
