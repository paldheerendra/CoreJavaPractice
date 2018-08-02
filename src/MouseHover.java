import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Mohsin\\Dheeru\\Work\\geckodriver-v0.20.0-win32\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.amazon.com/");
		// Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("nav-link-shopall"))).build().perform();

	}

}
