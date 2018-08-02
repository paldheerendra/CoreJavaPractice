import java.io.FileNotFoundException;

public class Interview2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		int res;
		// try{
		try {
			res = num / 0;
			System.out.println("The result is" + res);
		} catch (ArithmeticException e) {
			System.out.println("divided by zero");
			// throw new FileNotFoundException();
		}

		
		/* catch (FileNotFoundException e) {
			 System.out.println("File not found"); }*/
		 

		
		finally {
			System.out.println("I am from finally");

		}
		
	}

}
