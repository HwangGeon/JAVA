package inheritance;

public class VIPCustomer extends Customer {
	double saleRatio; // VIP�� ��ǰ�� 10%���� ���ݿ� ������ �� ����
	int agentID;
	static int tempAgentID = 0; // �������� ������ (����id�� 100�� ���� �ڵ����� 1���� 2,3...���� ǥ����)

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);

		// Customer�� private��������� protected�� �ٲ㵵 ������ ���⼭�� �����̿� !!!!(���� �����̿��� ������? ������Ƽ�尡 ������?)
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
		return super.showInfo()+"��� ����ID�� ["+this.getAgentID()+"] �Դϴ�";
	}
	
}
