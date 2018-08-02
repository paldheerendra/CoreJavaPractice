
public class ChildConstructor extends ConstructorPract {

	public ChildConstructor() {

		System.out.println(" default Child constructor");
	}

	public ChildConstructor(int i) {

		super(i);
		System.out.println(" Child constructor with one int param:" + i);
	}

	public ChildConstructor(String a) {
		super(a);
		System.out.println("Child Constructor with one String param:" + " " + a);

	}

	public ChildConstructor(int a, int b) {
				
		System.out.println("Child Constructor with two int param:" +" " + "Addition:" + " "+ (a+b));

	}
	
		
	public static void main(String[] args) {

		new ChildConstructor(); // we can call constructor by just creating object
		
		ChildConstructor obj1 = new ChildConstructor(10);
		
		ChildConstructor obj2 =new ChildConstructor("Dheerendra");
		obj2.addition(10, 20);
		
		new ChildConstructor(20,30);
	}

}
