package abstract_class;

public class Level3 extends Game {

	@Override
	public void run() {
		System.out.println("엄청 빨리 달림");
	}
	@Override
	public void jump() {
		System.out.println("엄청 높이 점프함");
	}
	@Override
	public void turn() {
		System.out.println("한바퀴 돌았음");
	}
	@Override
	public void showLevelMessage() {
		System.out.println("---------레벨3 입니다");
	}
}
