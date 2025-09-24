package chromeoptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement element=driver.findElement(By.xpath("//a[text()='GUI Elements']"));
		System.out.println(element.getText());
		driver.quit();
	}

}
