
public class ExceptionCheck {
	
	
	public static void main(String[] args) {

		try{
			
			int i= 5/0;
			
		} 
		
		/*//it will give compile time error if you write another catch with the exact except because the exception is already handled by Exception in catch block
		catch (Exception e) {
			System.out.println("Exception");
		}
		*/
		catch (ArithmeticException ea) {
			 
			 System.out.println(" ArithmeticException");

		 }
		
		//we can write Exception in catch block after specific exception like ArithmeticException
		catch (Exception e) {
			System.out.println("Exception");
		}
		
		System.out.println("after catch block");
			 

	}

}
