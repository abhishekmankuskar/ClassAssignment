package question1;
import java.util.Scanner;

public class TestEvenPrint {
	
	public static void main(String[] args) {
		int n=0, i=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of n : ");
		n = sc.nextInt();
		
		for(i=1; i<=n; i++)
		{
			if(i%2 == 0)
			{
				System.out.print(i+"\t");
			}
		}
		sc.close();
	}
}