package exercise2;

public class Looper extends Thread {
	//This flag is initiallised to false
	boolean isInterrupted = false;
	public void run() {
		//Run the loop until isInterrupted becomes true
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
