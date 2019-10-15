package exercise4;

import java.util.List;

public interface IPointInterface {
	public void add(Point point);
	public boolean search(Point point);
	public List<Point> getAllX(String x);
	public void replace(Point point1, Point point2);
}
