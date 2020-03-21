package question3;
import java.util.Scanner;

public class TestBook2 {

	Book bk[] = new Book[10];
	
	public static void main(String[] args) {
		TestBook2 tb = new TestBook2();
		tb.createBook();
	}
	
	public void createBook()
	{
		int i=0, n;
		String Title;
		double Price;
		
		TestBook2 tb1 = new TestBook2();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("No. of books to be created : ");
		n = sc.nextInt();
				
		for(i=0; i<n; i++)
		{
			Book b1 = new Book();
			System.out.print("Book Title : ");
			Title = sc.next();
			b1.setBkTitle(Title);
			System.out.print("Book Price : ");
			Price = sc.nextDouble();
			b1.setBkPrice(Price);
			tb1.bk[i] = b1;
		}
				
		System.out.println("Book Title \t\t Price");
		tb1.showBook();
		sc.close();
	}
	
	public void showBook()
	{
		try {
				for(Book b:bk) {
					System.out.println("------------------------------------------------");
						System.out.println(b.getBkTitle()+"\t\t Rs."+b.getBkPrice());
				}
		}
		catch(Exception e)
		{
			System.out.println("End");
		}
	}
}