package mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slidebar {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement min=driver.findElement(By.xpath("//div[@id='slider-range']//span"));
		WebElement max=driver.findElement(By.xpath("(//div[@id='slider-range']//span)[2]"));
		System.out.println(min.getLocation());// 974,2024
		System.out.println(max.getLocation());//1104,2024
		Actions act=new Actions(driver);
		act.dragAndDropBy(min, -50, 0).perform();
		act.dragAndDropBy(max, 100, 0).perform();
		System.out.println(min.getLocation());
		System.out.println(max.getLocation());
		
	}

}
