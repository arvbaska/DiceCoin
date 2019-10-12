package exercise3;

public class DiceApp extends Thread {

	private int rolls;
	private String name;
	private Dice dice;

	public DiceApp(int rolls, Dice dice, String name) {
		this.rolls = rolls;
		this.name = name;
		this.dice = dice;
	}

	//Running thread
	public void run() {
		for (int index = 0; index < this.rolls; index++) {
			dice.addIntoArray(name);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
