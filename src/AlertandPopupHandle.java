import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertandPopupHandle {

	public static void main(String[] args) throws InterruptedException {


		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohsin\\Dheeru\\Work\\geckodriver-v0.20.0-win32\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		//alert.dismiss();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}
