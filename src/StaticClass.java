
public class StaticClass {
	
	int i=100;
    static int a=10;
    
    public void muliply() {}
    
	public static class NestedClass{
		int x= a;
		
		public void add() {
			
		}

	public static void main(String[] args) {
		
		StaticClass.NestedClass obj = new StaticClass.NestedClass();
		obj.x=100;
		obj.add();
		
		StaticClass obj2= new StaticClass();
		obj2.i=200;
	}

}
}
