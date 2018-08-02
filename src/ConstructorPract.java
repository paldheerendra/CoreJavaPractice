
public class ConstructorPract {

	public ConstructorPract() {

		System.out.println("Default constructor in parent");
		
	}

	public ConstructorPract(int i) {
		System.out.println("Parent constructor with one interger param" + " " + i);

	}

	public ConstructorPract(String str) {
		System.out.println("Parent constructor with string param:" + " " + str);
	}
	
	public void addition(int i, int j) {
		
		System.out.println("Addition method:"+" "+(i+j));
	}
}
