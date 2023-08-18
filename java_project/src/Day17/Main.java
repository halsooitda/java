package Day17;

public class Main {

	public static void main(String[] args) {
//		Customer c = new Customer();
//		c.calPrice(9000);
//		c.customerInfo("홍길동");
//		c.calPrice(8000);
//		c.customerInfo("홍길동");
//		System.out.println(c.calPrice(9000));
//		
//		GoldCustomer g = new GoldCustomer();
//		g.calPrice(9000);
//		g.customerInfo("홍길순");
//		System.out.println(g.calPrice(9000));
//		
//		VIPCustomer v = new VIPCustomer();
//		v.calPrice(9000);
//		v.customerInfo("미미");
//		System.out.println(v.calPrice(9000));
		
		Customer lee = new Customer(111, "이길동");
		GoldCustomer kim = new GoldCustomer(222, "김길동");
		VIPCustomer hong = new VIPCustomer(333, "홍길동");
		
		// 다형성 이용
		Customer[] customerList = new Customer[10];
		int cnt = 0;
		customerList[cnt] = lee;
		cnt++;
		customerList[cnt] = kim;
		cnt++;
		customerList[cnt] = hong;
		cnt++;
		
		System.out.println("--고객정보 출력--");
		for(int i=0; i<cnt; i++) { 
			customerList[i].customerInfo();
		}
		
		System.out.println("--구매금액과 할인율 계산--");
		int price = 10000;
		for(int i=0; i<cnt; i++) {
			System.out.println(customerList[i].customerName+"님의 구매금액 : "+customerList[i].calPrice(price)
					+ ", 포인트 : "+customerList[i].bonusPoint+"점");
		}
		
//		int price = lee.calPrice(10000);
//		lee.customerInfo();
//		System.out.println(lee.customerName+"님의 구매금액 : "+price);
		
		
		
		
	}

}
