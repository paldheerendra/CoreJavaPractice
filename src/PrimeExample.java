
public class PrimeExample {

	public static void main(String[] args) {


		int num=7;
		 int count= 0;
		 
		 for(int i=2; i< num; i++) {
			 
			 if(num % i ==0)
			 {
				 
				 count++;
				 break;
			 }
		 }
		 
		 if(count == 0)
			 System.out.println("It is a prime number");
		 
		 else 
			 System.out.println("It is not a prime number");
		 
	}

}
