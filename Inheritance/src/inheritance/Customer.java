package inheritance;

//부모클래스
public class Customer {

	private int customerID; // 고객 아이디
	private String customerName; // 고객 이름
	private String customerGrade; // 고객 등급 [기본: "SILVER"]
	

	int bonusPoint; // 보너스포인트
	double bonusRatio; // 제품 구매시 보너스포인트 적립비율 [기본:제품구매가격의 1%] (고객등급마다 다름)

	/*
	 * 기본생성자 제공안함 (객체생성시 꼭 id랑 name을 받아야함) public Customer() {}
	 */

	// 커스터머 객체생성시 아이디와 이름값 입력을 받음, 기본등급은 실버
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
	}

	// 보너스 포인트 계산하고 적립하는 메소드 [SILVER등급] (제품가격을 입력받아 보너스포인트 계산후 지불할 금액 리턴)
	public int calcProductPrice(int productPrice) {
		this.bonusPoint += (int) (productPrice * bonusRatio);
		return productPrice;
	}

	// Show
	public String showInfo() {
			return customerName + "님의 등급은 " + customerGrade + "이고 보너스포인트는 " + bonusPoint + "원 남았습니다.";
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
