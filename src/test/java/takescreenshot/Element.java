package takescreenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement element=driver.findElement(By.xpath("//a[text()='GUI Elements']"));
		File source=element.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"//screenshots//element.png");
		source.renameTo(target);
		driver.quit();
		
	}

}
