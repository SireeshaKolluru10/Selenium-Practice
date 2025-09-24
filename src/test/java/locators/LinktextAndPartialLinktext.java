package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktextAndPartialLinktext {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.vwo.com/#/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Start a free trial")).click();
		driver.findElement(By.partialLinkText("Privacy")).click();
		driver.quit();
	}

}
