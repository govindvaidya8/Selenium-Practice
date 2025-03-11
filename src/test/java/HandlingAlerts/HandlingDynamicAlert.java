package HandlingAlerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingDynamicAlert {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		try {
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[starts-with(@class,'oxd-button')]")).submit();
			try {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				Alert alert = wait.until(ExpectedConditions.alertIsPresent());
				//System.out.println(alert);
				if (alert != null) {
					alert.accept();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Execution next commands.....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
