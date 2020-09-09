package inheritance;

public class VIPCustomer extends Customer {
	double saleRatio; // VIP는 제품을 10%할인 가격에 구매할 수 있음
	int agentID;
	static int tempAgentID = 0; // 담당상담원이 배정됨 (상담원id은 100개 존재 자동으로 1부터 2,3...으로 표현함)

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);

		// Customer의 private멤버변수를 protected로 바꿔도 되지만 여기서는 세터이용 !!!!(질문 세터이용이 나은가? 프로텍티드가 나은가?)
		this.setCustomerGrade("VIP");
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;

		for (int i = 0; i < 101; i++) {
			if (tempAgentID == i) {
				this.agentID = i + 1;
				tempAgentID++;
				break;
			} 
		}
	}
	
	@Override
	public int calcProductPrice(int productPrice) {
		this.bonusPoint += productPrice * bonusRatio;
		return productPrice - (int)(productPrice * saleRatio);	
	}
	
	@Override
	public String showInfo() {
		return super.showInfo()+"담당 상담원ID는 ["+this.getAgentID()+"] 입니다";
	}
	
}
