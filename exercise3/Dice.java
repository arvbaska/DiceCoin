package exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dice {
	private Random random;
	public List<Integer> rollArray = new ArrayList<Integer>();

	private int getRandomNumberInRange() {

		random = new Random();
		return random.nextInt((6 - 1) + 1) + 1;

	}

	synchronized public void addIntoArray(String name) {
		rollArray.add(getRandomNumberInRange());
		System.out.println(rollArray + " "+ name);
	}
}
