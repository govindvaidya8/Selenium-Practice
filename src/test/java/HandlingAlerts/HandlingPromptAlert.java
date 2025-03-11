package HandlingAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPromptAlert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("promptBtn")).click();
		Alert alert = driver.switchTo().alert();
		String s = alert.getText();
		System.out.println(s);
		alert.sendKeys("Shashank");
		alert.accept();
		

	}

}
