
public class MainMethodConcept{

	
	public static void add (int a, int b) {
	
		int c= a+b;
		System.out.println(c);
		//main(10,20);
	}

	
	public static void main(int a, int b) {

		System.out.println(a+b);
		//add(20,30);
		
	}

	

	public void multiply(int a, int b) {
		int c= a * b;
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {

		add(20,30);
		main(10,20);
		
	}
	



}
