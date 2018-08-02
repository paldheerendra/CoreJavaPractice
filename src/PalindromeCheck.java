
public class PalindromeCheck {

	public static void main(String[] args) {
		
		
		//reverse a string and check palindrome

		String str = "MADAM";
		
		String rev = "";
		for (int i = str.length()-1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.println(rev);
		if (str.equals(rev))
			System.out.println(str + " is a palindrome");
		else
			System.out.println(str + " is not a palindrome");
		
 // reverse the number and check palindrome
		int num=1234321;
		int temp=num;
		
		int revNUm=0;
		
		while(num !=0)
		{
			revNUm= revNUm * 10 + num % 10;
			num= num/10;
		}
		System.out.println(revNUm);
		if(temp==revNUm) {
			System.out.println("It is a palindrome");
		}
		else
			System.out.println("It is not a palindrome");
	}
	
	

}
