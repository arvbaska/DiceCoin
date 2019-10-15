package exercise4;

public final class Point {
	private String x;

	public Point(String x) {
		this.x = x;
	}

	public String getX() {
		return x;
	}

	@Override
	public String toString() {
		return x;
	}

}
