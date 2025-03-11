package HandlingDatePickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickerwithLoops {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			if (alert != null) {
				alert.dismiss();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			String date = "2";
			String month = "Sep";
			String year = "2027";
			driver.findElement(By.xpath("//input[@id='datepicker']")).click();
			while (true) {
				String act_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				String act_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				if (act_month.contains(month) && act_year.contains(year)) {
					break;
				} else {
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				}
			}
			List<WebElement> dates = driver
					.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));
			for (WebElement dt : dates) {
				if (dt.getText().equals(date)) {
					dt.click();
				}
			}
		} catch (Exception e) {
			e.getMessage();
		}

	}

}
