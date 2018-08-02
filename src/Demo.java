import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Test the eclipse");

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\Mohsin\\Dheeru\\Work\\chromedriver_win32\\chromedriver.exe");

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Mohsin\\Dheeru\\Work\\geckodriver-v0.20.0-win32\\geckodriver.exe");

		// WebDriver driver= new ChromeDriver();
		WebDriver driver = new FirefoxDriver();

		// WebDriver driver= new SafariDriver();

		driver.get("https://www.facebook.com/");

		// to get the browser window id.. we can handle browser pop up windows through
		// below logic

		Set<String> handler = driver.getWindowHandles();

		Iterator<String> it = handler.iterator();

		String pid = it.next();

		System.out.println(pid);

	}

}
