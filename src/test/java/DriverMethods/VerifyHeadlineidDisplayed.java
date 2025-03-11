package DriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyHeadlineidDisplayed {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement heading = driver.findElement(By.xpath("//p[@class='description']/span"));
        boolean isDisplayed = heading.isDisplayed();
        if(isDisplayed==true) {
        	System.out.println("Heading is Displayed");
        }else {
        	System.out.println("Heading is not Displayed");
        }
        driver.quit();
	}

}
