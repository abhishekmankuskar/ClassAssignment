package question4;
import java.util.Scanner;

public class TestRectangle {
	public float perim, areat;
	Rectangle rc = new Rectangle();

	public void peri() {
		perim = ((2)*((rc.getLength()) + rc.getWidth()));
		System.out.println("Perimeter of Rectangle : "+perim);
	}
	
	public void area() {
		areat = ((rc.getLength())*(rc.getWidth()));
		System.out.println("Area of Rectangle : "+areat);
	}
	
	public static void main(String[] args) {
			float len, wid;
			TestRectangle trc = new TestRectangle();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter length of the Rectangle : ");
			len = sc.nextFloat();
			trc.rc.setLength(len);
			
			System.out.println("Enter width of the Rectangle : ");
			wid = sc.nextFloat();
			trc.rc.setLength(wid);
			
			trc.peri();
			trc.area();
			sc.close();
	}

}