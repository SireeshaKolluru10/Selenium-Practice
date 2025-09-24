package chromeoptions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensions {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		File file=new File("C:\\Users\\sirisha\\OneDrive\\Desktop\\Sep folder\\crx files\\uBlock.crx");
		options.addExtensions(file);
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		
		
	}

}
