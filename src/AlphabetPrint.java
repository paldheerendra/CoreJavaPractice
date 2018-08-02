
public class AlphabetPrint {

	public static void main(String[] args) {


		char al='A', lastChar='Z';
		int num=1;
		
		 for(int i = 1; i <= (lastChar-'A'+1); i++) {
	            
	                System.out.print(al+ " " +num + " ");
	                al++;
	                num++;
	            }
		 
		 System.out.println();
	            
		
		
		 System.out.println();
		
		char last = 'E', alphabet = 'A';

        for(int i = 1; i <= (last-'A'+1); ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(alphabet + " ");
            }
            ++alphabet;

            System.out.println();
        }
	}

}
