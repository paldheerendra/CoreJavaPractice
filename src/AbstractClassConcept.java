
public abstract class AbstractClassConcept{
	
	public abstract void multiply(int a, int b);
	
	public static void add (int a, int b) {
		
		int c= a+b;
		System.out.println(c);
		
	}
	
	public void divide(int a, int b) {

		System.out.println(a/b);
		//add(20,30);
		
	}


	public static void main(String[] args) {

		add(20,30);
		
	}



}
