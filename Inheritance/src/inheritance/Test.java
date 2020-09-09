package inheritance;

public class Test {

	public static void main(String[] args) {
		Customer hwang = new Customer(1001,"황건");
		hwang.calcProductPrice(10000);
		System.out.println(hwang.showInfo());
		
		VIPCustomer kim = new VIPCustomer(1002,"김민수");
		kim.calcProductPrice(10000);
		System.out.println(kim.showInfo());
		
		Customer lee = new VIPCustomer(1003, "이영희");
		lee.calcProductPrice(10000);  //Customer타입이지만 VIPCustomer에 오버라이드된 메소드 호출
		System.out.println(lee.showInfo());
	}

}
