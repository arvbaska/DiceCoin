package exercise3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DiceAppMain {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first dice roll :: ");
		int firstDiceRoll = sc.nextInt();

		System.out.println("Enter the second dice roll :: ");
		int secondDiceRoll = sc.nextInt();
		Dice dice = new Dice();

		DiceApp dice1 = new DiceApp(firstDiceRoll,dice, "Dice 1");
		DiceApp dice2 = new DiceApp(secondDiceRoll,dice, "Dice 2");

		dice1.start();
		dice2.start();

		dice1.join();
		dice2.join();

		Map<String, Integer> frequencyMap = new HashMap<>();

		dice.rollArray.forEach(item -> {
			if (!frequencyMap.containsKey(item))
				frequencyMap.put(String.valueOf(item), Collections.frequency(dice.rollArray, item));
		});
		System.out.println("FREQUENCY of Items ::: " + frequencyMap);
	}
}
