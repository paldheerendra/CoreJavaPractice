import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Mohsin\\Dheeru\\Work\\geckodriver-v0.20.0-win32\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.freecrm.com/"); // enter URL

		Thread.sleep(3000);
		
		
		// driver.findElement(By.name("username")).sendKeys("dheerep");
		// driver.findElement(By.name("password")).sendKeys("dheeru@123");

		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		long starttime= System.currentTimeMillis();
		WebElement loginButton=driver.findElement(By.xpath("//input[@value='Login']"));
		
		WebDriverWait wait= new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		
		loginButton.click();
		
		
		long endtime= System.currentTimeMillis();
		
		long totaltime=endtime-starttime;  // Response time
		
		System.out.println("Response Time: " + totaltime);

		
		// Thread.sleep(3000);

		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();

	}
	

}
