package Day21;

public class Sale_Generic<K,V> { //매개변수를 받는 형식 key,value
	
	//멤버 변수 menu, price
	private K menu;
	private V price;
//	private K type; //K에 들어오면 다 똑같은 타입으로
//	private V code; //V에 들어오면 다 똑같은 타입으로
	
	public Sale_Generic() {}
	public Sale_Generic(K menu, V price) {
		this.menu = menu;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Sale_Generic [menu=" + menu + ", price=" + price + "]";
	}
	
	//getter/setter
	public K getMenu() {
		return menu;
	}
	public void setMenu(K menu) {
		this.menu = menu;
	}
	public V getPrice() {
		return price;
	}
	public void setPrice(V price) {
		this.price = price;
	}

}
