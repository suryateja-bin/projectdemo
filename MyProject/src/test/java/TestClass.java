import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String path="C:\\Users\\Rakesh 1\\eclipse-workspace\\MyProject\\driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Register_btn=driver.findElement(By.xpath("//a[@class='ico-register']"));
		Register_btn.click();
		WebElement Register_msg=driver.findElement(By.xpath("//h1[text()='Register']"));
		Boolean check=Register_msg.isDisplayed();
		if(check==true) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	

	}

}
