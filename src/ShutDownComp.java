import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShutDownComp {

	public static void main(String[] args) throws IOException {


		Runtime runtime = Runtime.getRuntime();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
        int sec=5;
        Process proc = runtime.exec("shutdown -s -t " + sec);
		
        System.exit(0);
	}

}
