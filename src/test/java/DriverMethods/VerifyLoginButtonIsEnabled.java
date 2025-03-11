package DriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLoginButtonIsEnabled {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'Email')]")).sendKeys("govindvaidya8@outlook.com");
		driver.findElement(By.xpath("//input[contains(@id,'Password')]")).sendKeys("Shashank");
		WebElement btn_login= driver.findElement(By.xpath("//input[contains(@value,'Log in')]"));
		boolean isEnabled = btn_login.isEnabled();
        if(isEnabled==true) {
        	btn_login.submit();
        	System.out.println("Clicked on the button");
        }else {
        	System.out.println("Button is not Enabled");
        }
        driver.quit();
	}
	

}
