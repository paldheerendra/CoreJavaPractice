
public class InterviewQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * double result = add1(1, 2); System.out.println(result); } static int add(int
		 * x, int y) { return x+y; } static double add1(double x, double y) { return
		 * x+y;
		 * 
		 * }
		 */

		String str1 = "Hello";
		String str2 = "Hello";
		// String str3 = "Hello" ;
		String str3 = new String("Hello"); // Using constructor

		if (str1 == str2)
			System.out.println("Equal 1");
		else
			System.out.println("Not Equal 1");

		if (str1 == str3)
			System.out.println("Equal 2");
		else
			System.out.println("I am constructed using constructor");

		if (str1.equals(str3))
			System.out.println("Equal 3");
		else
			System.out.println("Not Equal 3");

		if (str2 == str3)
			System.out.println("Hi");
		else
			System.out.println("Bye");

	}

}
