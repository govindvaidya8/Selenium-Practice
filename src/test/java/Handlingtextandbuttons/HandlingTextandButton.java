package Handlingtextandbuttons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTextandButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		Options option = driver.manage();
		option.deleteAllCookies();
		option.timeouts().implicitlyWait(Duration.ofSeconds(10));
		option.window().maximize();
		// By txt_username = By.name("username");
		// System.out.println(txt_username);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).submit();

	}

}
