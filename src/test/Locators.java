package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "/home/nikunjshah204gm/Downloads/chromedriver");
		
		System.setProperty("webdriver.gecko.driver", "/home/nikunjshah204gm/Downloads/geckodriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com//");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		
		/*WebElement lnkLogin = driver.findElement(By.xpath("//a[@class='login']"));
		
		lnkLogin.click();
		
		WebElement username = driver.findElement(By.xpath("//input[@name='user_login']"));
		
		username.sendKeys("abc@xyz.com"); */
		
		
		
		//Syntax:”css = tag#id”
		WebElement usernmae = driver.findElement(By.cssSelector("input#email"));
		
		usernmae.sendKeys("abc123");
		
		//Syntax: “css = tag.class”
		
		WebElement pwd = driver.findElement(By.cssSelector("input#pass"));
		
		pwd.sendKeys("122132");
		
		
		//Syntax: “css = tag[attribute=value]”
		
		WebElement login = driver.findElement(By.cssSelector("button[name=login]"));
		
		login.click();
		
		
		
		// DropDown Code
		
		
		WebElement month = driver.findElement(By.xpath("//*[@name='birthday_month']"));
		
		Select ddmonth = new Select(month);
		
		ddmonth.selectByIndex(1);
		
		ddmonth.selectByValue("2");
		
		ddmonth.selectByVisibleText("Feb");
		
	}

}
