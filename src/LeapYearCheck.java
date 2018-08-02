
public class LeapYearCheck {

	public static void main(String[] args) {

		int yr=2012;

		if((yr%4 == 0) && (yr%100!=0))
	       {
	           System.out.print("This is a Leap Year");
	       }
	       else if(yr%100 == 0)
	       {
	           System.out.print("This is not a Leap Year");
	       }
	       else if(yr%400 == 0)
	       {
	           System.out.print("This is a Leap Year");
	       }
	       else
	       {
	           System.out.print("This is not a Leap Year");
	       }
	}

}
