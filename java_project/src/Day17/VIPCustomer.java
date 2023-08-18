package Day17;

public class VIPCustomer extends Customer {
	double saleRatio; // 할인율
	
	public VIPCustomer() {
//		setCustomerGrade("VIP");
//		setBonusRatio(0.05);
	}
	public VIPCustomer(int id, String name) {
		super(id, name);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	@Override
	public int calPrice(int price) {
		super.calPrice(price);
//		price = price-(price/10);
//		return price;
		return price - (int)(price*saleRatio);
	}

//	@Override
//	public void customerInfo(String customerName) {
//		super.customerInfo(customerName);
//	}

}
