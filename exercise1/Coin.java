package exercise1;

import java.util.Random;

public class Coin extends Thread {
	private int numOfHeads = 0;
	private int numOfTails = 0;
	private int noOfTosses = 0;
	
	public Coin(int noOfTosses) {
		this.noOfTosses = noOfTosses;
	}

	public int getNumOfHeads() {
		return numOfHeads;
	}

	public int getNumOfTails() {
		return numOfTails;
	}

	public void run() {
		//Executes flip given number of times
		for (int i = 0; i < noOfTosses; i++) {
			if (flip() == 1) {
				numOfHeads++;
			} else {
				numOfTails++;
			}
		}
	}

	private int flip() {
		Random random = new Random();
		return random.nextInt(2);
	}

}
