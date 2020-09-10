package abstract_calss_car;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();

		carList.add(new Sonata());
		carList.add(new Avante());
		carList.add(new Grandeur());
		carList.add(new Genesis());

		for (int i = 0; i < carList.size(); i++) {
			carList.get(i).run();
			System.out.println("=========================");
		}

	}

}
