package abstract_class;

public class Player {
	
	private Game level;
	
	public Player() {
		level = new Level1();
		level.showLevelMessage();
	}
	
	public Game getLevel() {
		return level;
	}
	
	public void upgradeLevel(Game level) {
		this.level = level;
		level.showLevelMessage();
	}
	public void play(int count) {
		level.go(count);
	}
	
}
