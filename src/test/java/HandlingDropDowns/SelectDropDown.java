package HandlingDropDowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement drpdwn_country= driver.findElement(By.xpath("//select[@id='country']"));
		Select s = new Select(drpdwn_country);
		//s.selectByValue("india");
		//s.selectByIndex(1);
		//s.selectByVisibleText("India");
		s.selectByContainsVisibleText("Fr");
	}
}
