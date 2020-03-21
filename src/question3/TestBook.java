package question3;

public class TestBook {

	Book bk[] = new Book[10];
	
	public static void main(String[] args) {
		TestBook tb = new TestBook();
		tb.createBook();
	}
	
	public void createBook()
	{
		
		TestBook tb1 = new TestBook();
	
		Book b1 = new Book();
		b1.setBkTitle("ThingsToDo");
		b1.setBkPrice(455.27);
		tb1.bk[0] = b1;
		
		Book b2 = new Book();
		b2.setBkTitle("JAVA Book");
		b2.setBkPrice(350);
		tb1.bk[1] = b2;

		Book b3 = new Book();
		b3.setBkTitle("C++ Book");
		b3.setBkPrice(50);
		tb1.bk[2] = b3;
		
		System.out.println("Book Title \t\t Price");
		tb1.showBook();
	}
	
	public void showBook()
	{
		try {
				for(Book b:bk) {
						System.out.println(b.getBkTitle()+"\t\t Rs."+b.getBkPrice());
				}
		}
		catch(Exception e)
		{
			System.out.println("End");
		}
	}
}