package inheritance;

public class Test {

	public static void main(String[] args) {
		Customer hwang = new Customer(1001,"Ȳ��");
		hwang.calcProductPrice(10000);
		System.out.println(hwang.showInfo());
		
		VIPCustomer kim = new VIPCustomer(1002,"��μ�");
		kim.calcProductPrice(10000);
		System.out.println(kim.showInfo());
		
		Customer lee = new VIPCustomer(1003, "�̿���");
		lee.calcProductPrice(10000);  //CustomerŸ�������� VIPCustomer�� �������̵�� �޼ҵ� ȣ��
		System.out.println(lee.showInfo());
	}

}
