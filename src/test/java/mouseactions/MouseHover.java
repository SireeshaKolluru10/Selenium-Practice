package mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement button=driver.findElement(By.xpath("//button[text()='Point Me']"));
		WebElement mobiles=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions act=new Actions(driver);
		act.moveToElement(button).moveToElement(mobiles).build().perform();
	}

}
