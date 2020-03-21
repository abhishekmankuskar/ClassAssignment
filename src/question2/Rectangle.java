package question2;

public class Rectangle {
	private int length = 0, breadth = 0;
	private double rarea = 0;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}
	
	public void area()
	{
		System.out.println("  Length \t:\t"+length+"\n  Breadth \t:\t"+breadth);
		rarea = length * breadth;
		System.out.println("  Area \t\t: \t"+rarea);
	}
	
}