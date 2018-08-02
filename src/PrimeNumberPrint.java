
public class PrimeNumberPrint {

	public static void printPrimeNumber() {

		//int num = n;
		
		int num= 2;
		
		int count=0;

		int m = 0;

		for (int i = 2; i <= num; i++)

		{
			for (int j = 2; j < i; j++) {

				if (i % j == 0)

				{
					m = 1;
					break;
				} 
				else {
					m = 0;
				}
			}
			
			if (m == 0) {
				count++;
				System.out.println(i);

			}
			
			while(count !=10)
			{
			num++;
			}

		}
		

	}

	public static void main(String[] args) {
		printPrimeNumber();
		
		//printPrimeNumber(30);

	}

}
