package exercise4;

import java.util.ArrayList;
import java.util.List;

public class CollectionPoint implements IPointInterface {

	public List<Point> list;

	public CollectionPoint() {
		this.list = new ArrayList<Point>();
	}

	@Override
	public synchronized void add(Point point) {
		list.add(point);

	}

	@Override
	public synchronized boolean search(Point point) {
		return list.contains(point);
	}

	@Override
	public synchronized List<Point> getAllX(String x) {
		List<Point> matchList = new ArrayList<Point>();
		list.forEach(point -> {
			if(point.getX().matches("(.*)"+x+"(.*)")) {
				matchList.add(point);
			}
		});
		return matchList;
	}
	
	

	@Override
	public synchronized String toString() {
		return "CollectionPoint [list=" + list + "]";
	}

	@Override
	public void replace(Point point1, Point point2) {
		list.remove(point1);
		list.add(point2);
	}

}
