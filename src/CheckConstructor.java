
public class CheckConstructor {
	

	CheckConstructor() { // can't make it static or final

		System.out.println("Constructor is called");

	}
	

	static // this block will always be automatically called when you run the program
			
	{
		System.out.println("static block is called");
	}

	static int fun() {

		return 20;

	}

	public static void main(String[] args) {

		
		CheckConstructor obj= new CheckConstructor();		

		System.out.println(fun());
		

	}

}
