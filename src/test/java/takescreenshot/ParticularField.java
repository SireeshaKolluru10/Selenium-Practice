package takescreenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParticularField {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement field=driver.findElement(By.xpath("//div[@class='widget HTML' and @id='HTML15']"));
		File source=field.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"\\screenshots\\field.png");
		source.renameTo(target);
		
	}

}
