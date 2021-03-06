package chapter8.gamelevel;

public class MainBoardPlay {

	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		PlayerLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(1);
		
		PlayerLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(2);
	}

}
