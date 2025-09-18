package radiobuttonsandcheckboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingAllCheckBoxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		 List<WebElement> boxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		 for(WebElement b:boxes) {
			 b.click();
		 }
		 driver.quit();
	}

}
