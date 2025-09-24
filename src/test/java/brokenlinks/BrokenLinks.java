package brokenlinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int broken_links=0;
		int not_broken=0;
		for (WebElement link : allLinks) {
			String s = link.getAttribute("href");
			if (s == null || s.isEmpty()) {
				continue;
			}
			try {
				URL url = new URL(s);
				HttpURLConnection con = (HttpURLConnection) url.openConnection();
				con.connect();
				if (con.getResponseCode() >= 400) {
					System.out.println(s + "======== broken link");
					broken_links++;
				} else {
					System.out.println(s + "======== link is not broken");
					not_broken++;
				}

			} catch (Exception e) {

			}

		}
		System.out.println("Total no of broken links: "+broken_links);
		System.out.println("Total no of not broken links: "+not_broken);

	}
}
