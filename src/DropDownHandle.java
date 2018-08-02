import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Mohsin\\Dheeru\\Work\\geckodriver-v0.20.0-win32\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.goibibo.com/");

		// driver.findElement(By.id("gosuggest_inputDest")).sendKeys("PNQ");

		Select select = new Select(driver.findElement(By.xpath("//*[@id='gi_class']")));

		// select.selectByVisibleText("Business");
		select.selectByValue("W");


	}

}
