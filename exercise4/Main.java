package exercise4;

public class Main {

	public static void main(String[] args) {

		Point point1 = new Point("Point 1");
		Point point2 = new Point("Point 2");
		Point point3 = new Point("Point 3");
		Point point4 = new Point("Point 4");
		

		PointThread pointThread1 = new PointThread(point1);
		PointThread pointThread2 = new PointThread(point2);
		PointThread pointThread3 = new PointThread(point3);
		PointThread pointThread4 = new PointThread(point4);

		pointThread1.start();
		pointThread2.start();
		pointThread3.start();
		pointThread4.start();
		
		try {
			pointThread1.join();
			pointThread2.join();
			pointThread3.join();
			pointThread4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		PointThread.printList();

	}

}
