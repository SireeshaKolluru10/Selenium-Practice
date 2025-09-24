package keyboardactions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningLinkInWindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.jquery-az.com/");
		Set<String>s=driver.getWindowHandles();
		List<String>ids=new ArrayList(s);
		driver.switchTo().window(ids.get(0));
		driver.quit();
	}

}
