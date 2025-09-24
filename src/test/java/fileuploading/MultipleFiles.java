package fileuploading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFiles {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		String file1= "C:\\Users\\sirisha\\Downloads\\Java Notes.pdf";
		String file2= "C:\\Users\\sirisha\\Downloads\\Java Notes (1).pdf";
		driver.findElement(By.xpath("//input[@id='multipleFilesInput']")).sendKeys(file1+"\n"+file2);
		
		
		
	}

}
