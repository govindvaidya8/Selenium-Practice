package HandlingDatePickers;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerwithWhile {

	public static Month convertMonth(String month) {
		HashMap<String, Month> cmonth = new HashMap<>();
		cmonth.put("Jan", Month.JANUARY);
		cmonth.put("Feb", Month.FEBRUARY);
		cmonth.put("Mar", Month.MARCH);
		cmonth.put("Apr", Month.APRIL);
		cmonth.put("May", Month.MAY);
		cmonth.put("Jun", Month.JUNE);
		cmonth.put("Jul", Month.JULY);
		cmonth.put("Aug", Month.AUGUST);
		cmonth.put("Sep", Month.SEPTEMBER);
		cmonth.put("Oct", Month.OCTOBER);
		cmonth.put("Nov", Month.NOVEMBER);
		cmonth.put("Dec", Month.DECEMBER);

		Month vmonth = cmonth.get(month);
		return vmonth;

	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		String year = "2020";
		String month = "Feb";
		String date = "14";
		String cYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		String cMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().substring(0, 3);
		
		if ((Integer.parseInt(year) > Integer.parseInt(cYear)
				&& convertMonth(month).compareTo(convertMonth(cMonth)) > 0)
				|| (year.equals(cYear) && convertMonth(month).compareTo(convertMonth(cMonth)) > 0)) {

			while (true) {
				String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

				if (currentMonth.substring(0, 3).equals(month) && currentYear.equals(year)) {
					break;
				}

				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

			}
		} else if (((Integer.parseInt(year) < Integer.parseInt(cYear))
				|| (year.equals(cYear) && convertMonth(month).compareTo(convertMonth(cMonth)) < 0))) {
			while (true) {
				String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

				if (currentMonth.substring(0, 3).equals(month) && currentYear.equals(year)) {
					break;
				}

				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();

			}

		} else {
			System.out.println("Invallid Month or year");
		}
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td//a"));
		for(WebElement dt:dates) {
			if(dt.getText().equals(date)) {
				dt.click();
			}
		}

	}

}
