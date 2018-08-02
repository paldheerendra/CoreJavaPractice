
public final  class CarClassInterfaceTest implements CarInterface {
	
	CarClassInterfaceTest(){
		
		System.out.println("Constructore is called");
	}

	
	public void carEngine() {
		
		
		System.out.println("Multi Functional");
		
		
	}

	public void wheel() {
		
		
	}

	public void model() {
		
		
	}
	
	public static void main(String args[]) {
		
		CarClassInterfaceTest obj=new CarClassInterfaceTest();
		
		obj.carEngine();
		
	}

	
	

}
