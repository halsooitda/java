package Day16;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product[] menu = new Product[10];
		
		char c = 'y'; // 반복 키워드
		int cnt = 0; // menu 객체를 핸들링 하기 위한 변수 (index 역할)
		
		while(c != 'n') {
			System.out.println("상품을 등록하시겠습니까? (y/n)");
			c = scan.next().charAt(0);
			if(c == 'y') {
				System.out.println("상품명 >");
				String name = scan.next();
				
				System.out.println("가격 >");
				int price = scan.nextInt();
				
				// menu에 등록 (상품객체(name+price)를 생성해서 배열에 등록)
				// case1
				// Product p = new Product(name, price); // 생성자로 등록
				// menu[cnt] = p; 
				
				// case2
				// Product p = new Product(); 
				// p.insertProduct(name, price); // 메서드를 이용하여 등록
				// menu[cnt] = p; 
				
				// menu[cnt] = new Product();
				// menu[cnt].insetProduct(name, price);
				
				menu[cnt] = new Product(name, price);
				cnt++; // index 증가
		
			}else {
				if(c == 'n') {
					System.out.println("상품등록 종료");
					
				}else { 
					System.out.println("y/n만 가능합니다.");
				}
			}
		}
		
		System.out.println("--등록된 상품 리스트--");
		for(int i=0; i<cnt; i++) {
			// toString 사용하는 경우
			System.out.println((i+1)+". "+menu[i]);
			// print 메서드를 사용하는 경우
			// menu[i].출력메서드명;
		}
		
		
		
		
	}

}
