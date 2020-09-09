package abstract_class;

public class Level2 extends Game{

	@Override
	public void run() {
		System.out.println("빨리 달림");	
	}
	@Override
	public void jump() {
		System.out.println("높이 점프함");	
	}
	@Override
	public void turn() {
		System.out.println("turn 할줄 모름");	
	}
	@Override
	public void showLevelMessage() {
		System.out.println("---------레벨2 입니다");
	}
}
