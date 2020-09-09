package abstract_class;

public class Level1 extends Game {

	@Override
	public void run() {
		System.out.println("천천히 달림");	
	}
	@Override
	public void jump() {
		System.out.println("jump 할줄 모름");
	}
	@Override
	public void turn() {
		System.out.println("turn 할줄 모름");
	}
	@Override
	public void showLevelMessage() {
		System.out.println("---------레벨1 입니다");
	}
}
