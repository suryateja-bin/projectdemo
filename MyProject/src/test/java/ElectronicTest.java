import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElectronicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
   String path="C:\\Users\\Rakesh 1\\eclipse-workspace\\MyProject\\driver\\chromedriver.exe";
   System.setProperty("webdriver.chrome.driver", path);
   driver= new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().deleteAllCookies();
   driver.get("http://demowebshop.tricentis.com/");
   WebElement electronic_btn=driver.findElement(By.xpath("//a[@href='/electronics']"));
   electronic_btn.click();
	}

}
