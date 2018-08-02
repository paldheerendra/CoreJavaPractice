import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExecuterConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Mohsin\\Dheeru\\Work\\geckodriver-v0.20.0-win32\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.amazon.com/");		
		//Thread.sleep(2000);
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		WebElement element = driver.findElement(By.id("nav_prefetch_yourorders"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		
		
		/*
		driver.get("https://www.freecrm.com/"); 
		Thread.sleep(2000);
			
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		// Thread.sleep(3000);

		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);

		// driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();

		Actions action1 = new Actions(driver);
		action1.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();

		// driver.findElement(By.linkText("Combined Form")).click(); ---will not work as
		// Javasrcipt has been used

		WebElement ele = driver.findElement(By.linkText("Combined Form"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
		
		*/

	}

}
