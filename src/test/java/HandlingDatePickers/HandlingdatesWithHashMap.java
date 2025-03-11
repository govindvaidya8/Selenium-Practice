package HandlingDatePickers;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingdatesWithHashMap {
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
		/*WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();*/
		String date = "02";
		String month = "Feb";
		String year = "2028";
		/*WebElement drpdwn_year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selectYear = new Select(drpdwn_year);
		selectYear.selectByValue(year);*/
		Month exp_month = convertMonth(month);
		Month act_month = convertMonth("Mar");
		int v = exp_month.compareTo(act_month);
		System.out.println(v);
		
		

	}

}
