package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("hello");
		alert.accept();
		//alert.dismiss();
	}

}
