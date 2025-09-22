package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdAndNameLocator {

	public static void main(String[] args) { 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.vwo.com/#/login");
		driver.findElement(By.id("login-username")).sendKeys("siri@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123r2");
		//driver.close();
	}

	}
