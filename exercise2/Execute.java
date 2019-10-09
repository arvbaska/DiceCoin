package exercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Execute {
	public static void main(String args[]) {
		System.out.print("Loop starts in 5 secs. Press enter anytime to stop the program");
		Looper execute = new Looper();
		
		try {
			execute.sleep(5000);
			execute.start();
			
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			br.readLine();
			execute.stop();
			System.out.println("Terminated");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
