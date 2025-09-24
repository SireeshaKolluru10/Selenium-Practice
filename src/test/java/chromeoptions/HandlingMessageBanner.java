package chromeoptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingMessageBanner {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	}

}
