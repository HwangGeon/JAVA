package abstract_class;

public class Level3 extends Game {

	@Override
	public void run() {
		System.out.println("��û ���� �޸�");
	}
	@Override
	public void jump() {
		System.out.println("��û ���� ������");
	}
	@Override
	public void turn() {
		System.out.println("�ѹ��� ������");
	}
	@Override
	public void showLevelMessage() {
		System.out.println("---------����3 �Դϴ�");
	}
}
