package exercise4;

public class PointThread extends Thread {

	private Point point;
	private static CollectionPoint collectionPoint = new CollectionPoint();

	public PointThread(Point point) {
		this.point = point;
	}
	
	public static void printList() {
		System.out.println(collectionPoint);
	}

	public void run() {

		// Adding point to collection
		collectionPoint.add(point);

		// Searching in collection
		if (collectionPoint.search(point))
			System.out.println(point.getX() + " exists");

		// Get all matching string
		System.out.println(collectionPoint.getAllX("Point"));
	}
}
