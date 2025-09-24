package keyboardactions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpeningLinkInNewTabUsingKeys {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement link = driver.findElement(By.xpath("//a[text()='Udemy Courses']"));
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();
		Set<String>windowids=driver.getWindowHandles();
		List<String>ids=new ArrayList(windowids);
		driver.switchTo().window(ids.get(1));
		driver.findElement(By.xpath("//a[text()='Blog']")).click();
		driver.switchTo().window(ids.get(0));
		driver.quit();
		
	}

}
