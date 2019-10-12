package exercise3;

import java.util.Scanner;

public class DiceAppMain {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);

		//No of tosses for dice 1
		System.out.println("Enter the first dice roll :: ");
		int firstDiceRoll = sc.nextInt();

		//No of tosses for dice 2
		System.out.println("Enter the second dice roll :: ");
		int secondDiceRoll = sc.nextInt();
		Dice dice = new Dice(firstDiceRoll + secondDiceRoll);

		DiceApp dice1 = new DiceApp(firstDiceRoll,dice, "Dice 1");
		DiceApp dice2 = new DiceApp(secondDiceRoll,dice, "Dice 2");

		dice1.start();
		dice2.start();

		dice1.join();
		dice2.join();

		System.out.println("FREQUENCY of Items ::: " + dice.getFrequency());
	}
}
