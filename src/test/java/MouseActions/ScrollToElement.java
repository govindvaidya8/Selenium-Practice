package MouseActions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement drpdwn = driver.findElement(By.xpath("//input[@id='comboBox']"));
		Actions action = new Actions(driver);
		action.moveToElement(drpdwn).click().perform();
		List<WebElement> items = driver.findElements(By.xpath("//div[@id='dropdown']//div"));
		for(WebElement item :items) {
			if(item.getText().equals("Item 63")) {
				action.scrollToElement(item).click().perform();
				
			}
		}

	}

}
