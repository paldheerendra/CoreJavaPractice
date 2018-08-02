
public class PyramidNumber {

	public static void main(String[] args) {

		int rows = 5;

		for (int i = rows; i > 0; i--) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println("##############################################");
		
		int rowCount = 1;
		for (int i = 5; i >= 1; i--)
        {
            //Printing i*2 spaces at the beginning of each row
 
            for (int j = 1; j <= i*2-1; j++)
            {
                System.out.print(" ");
            }
 
            //Printing j value where j value will be from 1 to rowCount
 
            for (int j = 1; j <= rowCount; j++)             
            {
                System.out.print(j+" ");
            }
 
            //Printing j value where j value will be from rowCount-1 to 1
             
            for (int j = rowCount-1; j >= 1; j--)
            {                 
                System.out.print(j+" ");             
            }                          
             
            System.out.println();
 
            //Incrementing the rowCount
 
            rowCount++;
        }
		
		
		
	}

}
