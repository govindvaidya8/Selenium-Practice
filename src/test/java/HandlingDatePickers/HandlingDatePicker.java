package HandlingDatePickers;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDatePicker {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		String yr = "2029";
		String mnth = "September";
		String dt = "18";
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select selectYear = new Select(year);
        selectYear.selectByValue(yr);
        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select selectMonth = new Select(month);
        selectMonth.selectByContainsVisibleText(mnth.substring(0, 3));
        List<WebElement> dates =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
        for(WebElement date :dates) {
        	if(date.getText().equals(dt)) {
        		date.click();
        	}
        }
	}

}
