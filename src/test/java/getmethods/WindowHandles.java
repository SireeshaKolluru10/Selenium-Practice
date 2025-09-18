package getmethods;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='wikipedia-search-results']//a"));
		for (WebElement link : links) {
			link.click();
		}
		Set<String> windowids = driver.getWindowHandles();
		for (String id : windowids) {
			{
				driver.switchTo().window(id);
				System.out.println(driver.getTitle());
				if (!(driver.getCurrentUrl().equals("https://testautomationpractice.blogspot.com/"))) {

					driver.close();

				}
			}
		}
		driver.quit();
	}
}
