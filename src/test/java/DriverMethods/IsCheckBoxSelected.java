package DriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsCheckBoxSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement chk_sunday = driver.findElement(By.xpath("//label[normalize-space()='Sunday']/../input"));
		chk_sunday.click();
		Thread.sleep(5000);
		boolean isSelected = chk_sunday.isSelected();
		System.out.println(isSelected);
		if (isSelected == true) {
			System.out.println("Sunday is Selected");
		} else {
			System.out.println("Sunday is not selected");
		}
		driver.quit();
	}

}
