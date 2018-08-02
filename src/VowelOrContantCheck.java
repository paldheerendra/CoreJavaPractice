
public class VowelOrContantCheck {

	public static void main(String[] args) {

		char ch= 'U';

		if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
		        ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
		        ch=='u' || ch=='U')
		        {
		            System.out.print(ch + " is a Vowel");
		        }
		        else
		        {
		            System.out.print(ch + " is a Contant");
		        }
	}

}
