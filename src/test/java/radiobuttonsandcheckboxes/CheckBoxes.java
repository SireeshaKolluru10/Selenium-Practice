package radiobuttonsandcheckboxes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement box=driver.findElement(By.xpath("//input[@id='sunday']"));
		box.click();
		boolean status=box.isSelected();
		System.out.println(status);
		box.click();
		System.out.println(box.isSelected());
	}

}
