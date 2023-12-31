package Day21;

public class Customer {
	private String name;
	private int age;
	private int price;
	
	public Customer() {}
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		if(age >= 15) {
			this.price = 100;
		}else {
			this.price = 50;
		}
		
	}
	
	@Override
	public String toString() {
		return "이름:" + name + ", 나이:" + age + ", 비용:" + price + "만원" ;
	}
	
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
