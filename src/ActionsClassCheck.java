import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassCheck {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Mohsin\\Dheeru\\Work\\geckodriver-v0.20.0-win32\\geckodriver.exe");
		
		
		WebDriver driver = new FirefoxDriver();
		
		//driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com");
		
		Actions action=new Actions(driver);
		
		//action.contextClick().build().perform();  //-- to right click at the current mouse location.
		
		//action.doubleClick().build().perform();
		
		//action.clickAndHold().build().perform();
		
		action.contextClick().sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
		
		Thread.sleep(3000);
		action.contextClick().sendKeys(Keys.ARROW_UP, Keys.ARROW_UP, Keys.ARROW_UP, Keys.ARROW_UP).build().perform();
	
		

		//driver.close();
	}

	

}
