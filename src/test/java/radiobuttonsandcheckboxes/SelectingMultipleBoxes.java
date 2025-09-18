package radiobuttonsandcheckboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingMultipleBoxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		 List<WebElement> boxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		 for(int i=0;i<boxes.size();i+=2) {
			 WebElement b=boxes.get(i);
					 b.click();
					 if(b.isSelected()) {
						 b.click();
					 }
		 }
	}

}
