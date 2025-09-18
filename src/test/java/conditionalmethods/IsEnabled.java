package conditionalmethods;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class IsEnabled {

		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://testautomationpractice.blogspot.com/");
			boolean status=driver.findElement(By.id("name")).isEnabled();
			System.out.println(status);
		}

	}