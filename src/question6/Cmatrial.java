package question6;

public class Cmatrial {
	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) {
			System.out.println("String "+(i+1)+" :- "+args[i]);
			System.out.println("String Length :- "+args[i].length());
			System.out.println("Uppercase String :- "+args[i].toUpperCase());
		}
	}
}