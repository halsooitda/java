package Day15;

/* Product 클래스 : 상품을 등록하는 클래스 - 메뉴하나 생성
 * 멤버변수 => 상품명, 가격
 * 상품등록메서드 => addProduct()
 * 출력메서드 => printProduct()
 * */
public class Product {
	private String pro;
	private int pri;
	
	// 기본생성자
	public Product() {}
	
	// 상품등록
	public void addProduct(String pro, int pri) {
		this.pro = pro;
		this.pri = pri;
		
	}
	
	// 출력
	public void printProduct() {
		System.out.println("상품명:"+pro+" 가격:"+pri);
	}
	
	// getter/setter
	public String getPro() {
		return pro;
	}

	public void setPro(String pro) {
		this.pro = pro;
	}

	public int getPri() {
		return pri;
	}

	public void setPri(int pri) {
		this.pri = pri;
	}
	
	
}
