package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("java");
		List<WebElement>options=driver.findElements(By.xpath("//ul//div[@role='option']"));
		for(WebElement op:options) {
			System.out.println(op.getText());
		}
		driver.findElement(By.xpath("(//ul//div[@role='option'])[8]")).click();
	}

}
