package inheritance;

//�θ�Ŭ����
public class Customer {

	private int customerID; // �� ���̵�
	private String customerName; // �� �̸�
	private String customerGrade; // �� ��� [�⺻: "SILVER"]
	

	int bonusPoint; // ���ʽ�����Ʈ
	double bonusRatio; // ��ǰ ���Ž� ���ʽ�����Ʈ �������� [�⺻:��ǰ���Ű����� 1%] (����޸��� �ٸ�)

	/*
	 * �⺻������ �������� (��ü������ �� id�� name�� �޾ƾ���) public Customer() {}
	 */

	// Ŀ���͸� ��ü������ ���̵�� �̸��� �Է��� ����, �⺻����� �ǹ�
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
	}

	// ���ʽ� ����Ʈ ����ϰ� �����ϴ� �޼ҵ� [SILVER���] (��ǰ������ �Է¹޾� ���ʽ�����Ʈ ����� ������ �ݾ� ����)
	public int calcProductPrice(int productPrice) {
		this.bonusPoint += (int) (productPrice * bonusRatio);
		return productPrice;
	}

	// Show
	public String showInfo() {
			return customerName + "���� ����� " + customerGrade + "�̰� ���ʽ�����Ʈ�� " + bonusPoint + "�� ���ҽ��ϴ�.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
}
