
public class ConstructorDefault {
	
	ConstructorDefault(){
		this(5, 10);
		int x=100;
		
	} //no argument constructor
	
	public ConstructorDefault(int i, int j) {
		
		System.out.println(i*j);
	}

	
	
	public void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorDefault obj= new ConstructorDefault();
		
		obj.add();
	}

}
