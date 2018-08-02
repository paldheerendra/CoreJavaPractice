
public class StringCheck {
	


	public static void main(String[] args) {

		String str = "11100100111";
		
		// o/p  00001111111

		String nStr = "";
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '0') {

				nStr = nStr + str.charAt(i);
			}
		}

		for (int j = 0; j < str.length(); j++) {

			if (str.charAt(j) == '1') {

				nStr = nStr + str.charAt(j);
			}
		}

		System.out.println(nStr);
		
		String str1 = "madam";
		
		// o/p  count repeated char and print repeated chars
		
		int count=0 ;
		
		for (int i = 0; i <=str.length()-1; i++) {

			if (str1.charAt(i) == str1.charAt(i+1)) {

				System.out.print(str1.charAt(i));
				
				count++;
			
			}
		}
		System.out.println(count);

	}
	
	
	
	


}
