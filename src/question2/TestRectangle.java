package question2;
import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		int len, bdt, n;
		String rnm;
		String rname[] = new String[10];
		Rectangle r[] = new Rectangle[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of Rectangle to be used : ");
		n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter the name and value of length and breadth of Rectangle : ");
			rnm = sc.next();
			len = sc.nextInt();
			bdt = sc.nextInt();
		
			Rectangle rc = new Rectangle(len, bdt);

			r[i] = rc;
			rname[i] = rnm;
		}
		for(int i=0; i<n; i++)
		{
			System.out.println("Rectangle : "+rname[i]);
			r[i].area();
		}
		sc.close();
	}

}
