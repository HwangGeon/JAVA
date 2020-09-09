package inheritance;

public class GoldCustomer extends Customer {

	double saleRatio;

	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		this.setCustomerGrade("GOLD");
		this.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}
	
	@Override
	public int calcProductPrice(int productPrice) {
		this.bonusPoint += productPrice * bonusRatio;
		return productPrice - (int)(productPrice * saleRatio);
	}
	
}
