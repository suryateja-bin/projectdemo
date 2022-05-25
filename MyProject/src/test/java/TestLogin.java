import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver open;	
	String path = System.getProperty("user.dir")+"\\driver\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	open=new ChromeDriver();
	open.manage().window().maximize();
	open.manage().deleteAllCookies();
	open.get("https://www.facebook.com/");
	open.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	open.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	WebElement email_box=open.findElement(By.xpath("//*[@class='inputtext _55r1 _6luy']"));
	email_box.click();
	Random randomgenerator= new Random();
	int random=randomgenerator.nextInt(1000);
	email_box.sendKeys("username"+random+"@gmail.com");
	WebElement pass_box=open.findElement(By.xpath("//*[@class='inputtext _55r1 _6luy _9npi']"));
	pass_box.click();
	pass_box.sendKeys("abcdefghi");
	WebElement log_btn=open.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
	log_btn.click();
	
	
	
	
	
	}

}
