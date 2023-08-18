package kiosk1;

//메뉴판 상속
public class Order extends Product {
	//주문 메뉴판이 있어야 주문이 가능
	//super(메뉴, 가격), 개수, 합계
	private int count;
	private int total;
	
	public Order() {}
	public Order(String menu, int price, int cnt) {
		super(menu, price);
		this.count = count;
		this.total = count * price;
	}
	
	//주문내역 출력 메서드
	public void print() {
		System.out.println(super.getMenu()+" : "+super.getPrice());
		System.out.println(count+"개 주문 => 금액 : "+total);
	}
	
	//getter/setter
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
}
