
public class NullKeyworkCheck {

	public static void nullCheck() {

		// int a= null;  //compile time error-- can't declare like that
		
						//can't do with premitive data types
		
		
		Integer a = 5;
		int i = a;
		
		//int b= (Integer) null;  // can define like this but --- will throw nullPointerException at runtime

		System.out.println(i);
		
		
		// null can only be assigned to reference type, you cannot assign null to primitive variables 


		Integer itr= null;		
		System.out.println(itr);   // will print null
		
		Boolean b=null;
		System.out.println(b);  // will print null
		
		
		String str= null;
		 System.out.println(str);    // will print null
		 
		 Object obj=null;
		 System.out.println(obj);    // will print null

	}

	public static void main(String[] args) {

		nullCheck();
	}

}
