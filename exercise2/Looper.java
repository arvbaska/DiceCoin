package exercise2;

public class Looper extends Thread {
	
	boolean isInterrupted = false;
	public void run() {
		while(!isInterrupted) {
			
			try {
				System.out.println("Hello");
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void setInterrupted(boolean isInterrupted) {
		this.isInterrupted = isInterrupted;
	}
	
	
}
