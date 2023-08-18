package Day17;

public class Customer {

	/* 일반고객 / Gold고객(할인) / VIP고객(할인)
	 * 
	 * 고객ID : int customerID
	 * 고객이름 : String customerName
	 * 고객등급 : String customerGrade
	 * 보너스 포인트 : int bonusPoint
	 * 보너스적립비율 : double bonusRatio
	 * 
	 * 클래스 생성
	 * - 기본 customerGrade = 'Silver'
	 * - 기본 bonusRatio = 0.01 => 1%
	 * 
	 * - 메서드
	 * 1. 보너스 적립 계산 메서드 (메서드명 : calcPrice(int price))
	 *  => 보너스를 적립하고, 할인여부를 체크하여 구매 price를 리턴 => silver는 할인여부 없음
	 *  - 구매금액 주고 적립보너스를 계산 bonusPoint 누적
	 *  
	 * 2. 출력메서드 (메서드명 : customerInfo)
	 *  => 홍길동님 등급은 VIP이며, 보너스 포인트는 1000입니다.
	 *  
	 *  - Silver 등급
	 *   => 제품을 살때 0% 할인 / 보너스 포인트 1% 적립
	 *  - Gold 등급
	 *   => 제품을 살때 10% 할인 / 보너스 포인트 2% 적립
	 *  - VIP 등급
	 *   => 제품을 살때 10% 할인 / 보너스 포인트 5% 적립
	 *   
	 *   GoldCustomer extands Customer {
	 *     기본 클래스를 오버라이딩 하여 사용
	 *   }
	 *   VIPCustomer extands Customer {
	 *     기본 클래스를 오버라이딩 하여 사용
	 *   }
	 *   
	 *   Main 클래스에서 확인
	 * */
	
	protected int customerID; // 고객 ID
	protected String customerName; // 고객명
	protected String customerGrade; // 등급
	protected int bonusPoint; // 보너스합계
	protected double bonusRatio; // 적립비율
	
//	{ customerGrade = "Silver";
//	  bonusRatio = 0.01;
//	}
	
	public Customer() {}
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer(); //
	}
	
	private void initCustomer() { //
		this.customerGrade = "Silver";
		this.bonusRatio = 0.01;
	}

	// 보너스 적립 계산 메서드
	public int calPrice(int price) {
		bonusPoint += (int)(price*bonusRatio); // 보너스 적립->누적
		return price; // 구매금액 리턴
		
	}
	
	// 출력 메서드
	public void customerInfo() {
		System.out.println(customerName+"님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonusPoint+"입니다.");
	}

	
	// getter/setter
	public int getCustomerID() {
		return customerID;
	}


	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerGrade() {
		return customerGrade;
	}


	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}


	public int getBonusPoint() {
		return bonusPoint;
	}


	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}


	public double getBonusRatio() {
		return bonusRatio;
	}


	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	
}
