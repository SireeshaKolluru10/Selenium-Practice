package fileuploading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleFile {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@id='singleFileInput']")).sendKeys("C:\\Users\\sirisha\\Downloads\\Java Notes.pdf");
		
		
	}

}
