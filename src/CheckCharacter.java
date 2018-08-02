
public class CheckCharacter {

	public static void main(String[] args) {

		char ch = 'k';

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.print(ch + " is an Alphabet");
		} 
		
		else {
			System.out.print(ch + " is not an Alphabet");
		}
	}

}
