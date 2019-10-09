package exercise2;

public class Looper extends Thread {
	public void run() {
		while(true) {
			
			try {
				System.out.println("Hello");
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
