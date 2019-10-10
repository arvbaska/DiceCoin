package exercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Execute {
	public static void main(String args[]) {
		System.out.print("Loop starts in 5 secs. Press enter anytime to stop the program");
		Looper looper = new Looper();
		
		try {
			looper.sleep(5000);
			looper.start();
			
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			br.readLine();
			//Set the isInterrupted flag to true
			looper.setInterrupted(true);
			System.out.println("Terminated");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
