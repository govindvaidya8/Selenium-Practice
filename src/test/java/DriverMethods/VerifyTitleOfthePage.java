package DriverMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleOfthePage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		String title = driver.getTitle();
		if(title.equals("Automation Testing Practice")) {
			System.out.println("Title is Matching");
		}else {
			System.out.println("Title is not matching");
		}
		driver.quit();

	}

}
