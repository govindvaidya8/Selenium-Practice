package DriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifyurl {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		String url = driver.getCurrentUrl();
		if (url.equals("https://testautomationpractice.blogspot.com/")) {
			System.out.println("Url is Matching");
		} else {
			System.out.println("Url is not Matching");
		}
		WebElement txt_name = driver.findElement(By.xpath("//input[@id='name']"));
		txt_name.sendKeys("Govind");
		Thread.sleep(3000);
		txt_name.sendKeys(Keys.CONTROL + "ac");
		Thread.sleep(3000);
		txt_name.clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Keys.CONTROL + "v");
		driver.quit();

	}

}
