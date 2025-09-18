package radiobuttonsandcheckboxes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes1 {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa-practice.netlify.app/checkboxes");
		WebElement box = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		System.out.println(box.isSelected());
		box.click();
		System.out.println(box.isSelected());
		box.click();
		System.out.println(box.isSelected());


	}

}
