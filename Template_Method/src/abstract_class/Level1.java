package abstract_class;

public class Level1 extends Game {

	@Override
	public void run() {
		System.out.println("õõ�� �޸�");	
	}
	@Override
	public void jump() {
		System.out.println("jump ���� ��");
	}
	@Override
	public void turn() {
		System.out.println("turn ���� ��");
	}
	@Override
	public void showLevelMessage() {
		System.out.println("---------����1 �Դϴ�");
	}
}
