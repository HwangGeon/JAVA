package abstract_class;

public class Level2 extends Game{

	@Override
	public void run() {
		System.out.println("���� �޸�");	
	}
	@Override
	public void jump() {
		System.out.println("���� ������");	
	}
	@Override
	public void turn() {
		System.out.println("turn ���� ��");	
	}
	@Override
	public void showLevelMessage() {
		System.out.println("---------����2 �Դϴ�");
	}
}
