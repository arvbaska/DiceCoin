package exercise1;

public class Execute {
	public static void main(String[] args) {
		final int noOfTosses = 1000;

		Coin coin = new Coin(noOfTosses);
		try {
			coin.start();
			coin.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println("Number of Heads: " + coin.getNumOfHeads() + " \nNumber of Tails: " + coin.getNumOfTails());

	}
}
