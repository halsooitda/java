package Day17;

public class GoldCustomer extends Customer {
	double saleRatio; // 할인율
	
	public GoldCustomer() {}
	
	public GoldCustomer(int id, String name) {
		super(id, name);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	@Override
	public int calPrice(int price) {
		super.calPrice(price); // 보너스 적립
		return price - (int)(price*saleRatio); // 할인계산
	}

//	@Override
//	public void customerInfo(String customerName) {
//		super.customerInfo(customerName);
//		
//	}

}
