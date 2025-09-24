package keyboardactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeninglinkInNewTab {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.jquery-az.com/");
	}

}
