
public class PatternPrint {

	public static void printStars(int n) {
		// number of spaces
		int i, j, k = 2 * n - 2;

		// outer loop to handle number of rows
		// n in this case
		for (i = 0; i < n; i++) {

			// inner loop to handle number spaces
			// values changing acc. to requirement
			for (j = 0; j < k; j++) {
				// printing spaces
				System.out.print(" ");
			}

			// decrementing k after each loop
			k = k - 2;

			// inner loop to handle number of columns
			// values changing acc. to outer loop
			for (j = 0; j <= i; j++) {
				// printing stars
				System.out.print("*" + " ");
			}

			// ending line after each row
			System.out.println();
		}
	}

	public static void main(String[] args) {

		printStars(5);
		
		
		
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("*" +" ");
            }
            System.out.println();
        }
        
        System.out.println("*****************************");
        
        int n=1;
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(n+ " ");
                n++;
            }
            System.out.println();
        }
        
        
        System.out.println("###########################");
        
        int rows=5;
        int k=0;
        for(int i=1; i<=rows; i++)
        {
            for(int space=1; space<=(rows-i); space++)
            {
                System.out.print("  ");
            }
            while( k != (2*i-1))
            {
                System.out.print("* ");
                k++;
            }
            k = 0;
            System.out.println();
        }
	}
	
	


}
