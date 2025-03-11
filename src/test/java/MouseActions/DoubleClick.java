package MouseActions;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement txt_field1 = driver.findElement(By.xpath("//input[@id='field1']"));
	    txt_field1.clear();
	    txt_field1.sendKeys("Shashank");
	    WebElement btn_dblclick = driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
	    Actions action = new Actions(driver);
	    Action btn = action.doubleClick(btn_dblclick).build();
	    btn.perform();
	}

}
