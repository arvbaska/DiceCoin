package exercise3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Dice {
	private Random random;
	public Integer[] rollArray;
	private int index = 0;

	//Initialise total tosses
	public Dice(int totalTosses) {
		rollArray = new Integer[totalTosses];
	}

	//Random number generator
	private int getRandomNumberInRange() {

		random = new Random();
		return random.nextInt(6)  + 1;

	}
	
	//Frequency for each number
	public Map<Integer,Integer> getFrequency(){
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		List<Integer> list = Arrays.asList(rollArray);
		list.forEach(item -> {
			if (!frequencyMap.containsKey(item))
				frequencyMap.put(item, Collections.frequency(list, item));
		});
		
		return frequencyMap;
	}

	synchronized public void addIntoArray(String name) {
		rollArray[index] = getRandomNumberInRange();
		System.out.println(name + " : "+ rollArray[index]);
		index++;
	}
}
