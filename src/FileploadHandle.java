import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;

public class FileploadHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mohsin\\Dheeru\\Work\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		 driver.get("https://html.com/input-type-file/");

		// driver.findElement(By.id("fileupload")).click(); ---Will never use click()
		// because we can't handle windows pop up

		 driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\Mohsin\\Desktop\\template.txt");

		// ** Practice


//		driver.get("https://codepen.io/rcass/pen/MmYwEp");
//		
//		driver.switchTo().frame("CodePen");
//			
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//input[@id='fileToUpload']")).sendKeys("C:\\Users\\Mohsin\\Desktop\\template.txt");
	}

}
