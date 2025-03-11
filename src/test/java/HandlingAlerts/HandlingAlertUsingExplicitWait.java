package HandlingAlerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlertUsingExplicitWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("promptBtn")).click();
		Alert alert =wait.until(ExpectedConditions.alertIsPresent());
        alert.sendKeys("Shashank");
        alert.accept();
	}
}
