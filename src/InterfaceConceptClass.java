
public class InterfaceConceptClass implements InterfaceConcept{

	@Override
	public void add() {
		
		
	}

	@Override
	public void add(int a, int b) {
		
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {

		InterfaceConceptClass obj=new InterfaceConceptClass();
		obj.add();
		obj.add(10, 20);
		
	}
	



}
