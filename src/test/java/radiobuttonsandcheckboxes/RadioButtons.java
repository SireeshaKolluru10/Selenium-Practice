package radiobuttonsandcheckboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement button = driver.findElement(By.xpath("//label[text()='Male']"));
		boolean status = button.isSelected();
		System.out.println(status);
		button.click();
		System.out.println(status);
		driver.quit();
	}

}
