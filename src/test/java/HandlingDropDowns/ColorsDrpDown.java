package HandlingDropDowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ColorsDrpDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement colors = driver.findElement(By.xpath("//select[@id='colors']"));
		Select s = new Select(colors);
		s.selectByContainsVisibleText("Red");
		s.selectByVisibleText("Green");
		s.selectByIndex(1);
		s.selectByValue("yellow");
	}

}
