package openbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://awesomeqa.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
