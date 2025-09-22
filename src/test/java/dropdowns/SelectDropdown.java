package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement drop=driver.findElement(By.xpath("//select[@id='animals']"));
		Select s=new Select(drop);
		s.selectByValue("cat"); // multiselect dropdown
		s.selectByIndex(2);
		s.selectByVisibleText("Fox");
		//s.deselectAll();
		List<WebElement>op= s.getAllSelectedOptions();
		System.out.println("size of the elements "+op.size());
		for(WebElement options:op) {
			System.out.println(options.getText());
		}
		List<WebElement>all=s.getOptions();
		System.out.println(all.size());
		for(WebElement opt:all) {
			System.out.println(opt.getText());
		}
	}

}
