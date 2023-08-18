package Day16;

public class Product {
	private String name;
	private int price;
	
	// 생성자
	public Product() {}
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// 추가메서드
	public void insertProduct(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// 출력
	@Override
	public String toString() {
		return  name + " : " + price;
	}
	
	//
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
