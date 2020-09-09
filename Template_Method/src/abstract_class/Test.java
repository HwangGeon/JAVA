package abstract_class;

public class Test {

	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		Game level2 = new Level2();
		player.upgradeLevel(level2);
		player.play(1);
		
		Game level3 = new Level3();
		player.upgradeLevel(level3);
		player.play(1);
	}

}
