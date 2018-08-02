
public interface InterfaceConcept {
	
	int a=10;
	
	public abstract void add();
	
	void add(int a, int b);
	
	//we can create static methods in interface because these will be local to the interfaces and can be directly called without object
	
	/*public static void divide(int a, int b) {

		System.out.println(a/b);
		//add(20,30);
		
	}

	public static void main(String[] args) {
		

		divide(20, 2);
		
	}*/
}
